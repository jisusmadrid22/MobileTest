package com.yzdev.mobiletest.presentation.screens.notice

import android.util.Log
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Warning
import androidx.compose.material.icons.rounded.Delete
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.google.accompanist.swiperefresh.SwipeRefresh
import com.google.accompanist.swiperefresh.rememberSwipeRefreshState
import com.yzdev.mobiletest.MainViewModel
import com.yzdev.mobiletest.R
import com.yzdev.mobiletest.data.repository.UiStatus
import com.yzdev.mobiletest.presentation.composable.itemListDesign.noticeItemList.ItemNoticeList
import com.yzdev.mobiletest.presentation.composable.shimmerEffect.AnimatedShimmerTwoLines
import com.yzdev.mobiletest.presentation.composable.snackBarDesign.SnackBarCustom
import com.yzdev.mobiletest.presentation.navigation.Destination
import com.yzdev.mobiletest.presentation.ui.theme.orange
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun NoticeLayout(
    mainViewModel: MainViewModel = hiltViewModel(),
    navHostController: NavHostController
) {

    LaunchedEffect(
        key1 = true,
        block = {
            mainViewModel.getNoticeApi()
        }
    )
    var swipeRefreshState by remember{ mutableStateOf(false)}
    val scope = rememberCoroutineScope()
    val notice by mainViewModel.notice.collectAsState(initial = UiStatus.Loading())
    val archive by mainViewModel.archive.collectAsState(initial = emptyList())

    val state = rememberScaffoldState()
    var showSnackbar by remember{ mutableStateOf(false)}

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        scaffoldState = state,
        snackbarHost = { state.snackbarHostState },
        topBar = {
            TopAppBar(
                elevation = 0.dp,
                title = {
                    Text(
                        text = stringResource(id = R.string.titleApp)
                    )
                }
            )
        }
    ) {
        Box(modifier = Modifier.fillMaxSize()){
            SwipeRefresh(
                state = rememberSwipeRefreshState(isRefreshing = swipeRefreshState),
                onRefresh = {
                    swipeRefreshState = true
                    scope.launch {
                        mainViewModel.getNoticeApi()
                        delay(650)
                        swipeRefreshState = false
                    }
                }
            ) {
                when(mainViewModel.noticeApi.value){
                    is UiStatus.Failure -> {
                        showSnackbar = true
                        Log.d("FAILURE", "${notice.message}")
                        LazyColumn(
                            modifier = Modifier.fillMaxSize()
                        ){
                            items(notice.get ?: emptyList(), key = {it.id}){item->

                                if(archive.find { it.story_id == item.story_id } == null){
                                    val dismissState = rememberDismissState(
                                        confirmStateChange = {
                                            if (it == DismissValue.DismissedToStart){
                                                mainViewModel.deleteNotice(item)
                                            }
                                            true
                                        }
                                    )

                                    SwipeToDismiss(
                                        state = dismissState,
                                        background = {
                                            val direction = dismissState.dismissDirection ?: return@SwipeToDismiss

                                            val color by animateColorAsState(
                                                targetValue = when(dismissState.targetValue){
                                                    DismissValue.Default -> Color.LightGray
                                                    DismissValue.DismissedToStart -> Color.Red
                                                    else -> MaterialTheme.colors.background
                                                }
                                            )

                                            val icon = when(direction){
                                                DismissDirection.EndToStart -> Icons.Rounded.Delete
                                                else -> Icons.Rounded.Delete
                                            }

                                            val scale by animateFloatAsState(
                                                targetValue = if(dismissState.targetValue == DismissValue.Default) 0.8f else 1.2f
                                            )

                                            val alignment = when(direction){
                                                DismissDirection.EndToStart -> Alignment.CenterEnd
                                                else-> Alignment.CenterEnd
                                            }

                                            Box(
                                                modifier = Modifier
                                                    .fillParentMaxSize()
                                                    .padding(horizontal = 12.dp)
                                                    .background(color),
                                                contentAlignment = alignment
                                            ){
                                                Icon(
                                                    modifier = Modifier.scale(scale),
                                                    imageVector = icon,
                                                    contentDescription = "Delete Icon"
                                                )
                                            }

                                        },
                                        directions = setOf(DismissDirection.EndToStart)
                                    ) {
                                        Card(
                                            modifier = Modifier.fillMaxWidth(),
                                            elevation = 0.dp,
                                            onClick = {
                                                navHostController.navigate(Destination.DETAIL_NOTICE.screenRoute + "/${item.id}")
                                            }
                                        ) {
                                            ItemNoticeList(item = item)
                                        }
                                    }
                                }
                            }
                        }
                    }
                    is UiStatus.Loading -> {
                        LazyColumn(
                            modifier = Modifier.fillMaxSize()
                        ){
                            items(List<String?>(20){null}){item->
                                Card(modifier = Modifier.fillMaxWidth()) {
                                    AnimatedShimmerTwoLines()
                                }
                            }
                        }
                    }
                    is UiStatus.Success -> {
                        LazyColumn(
                            modifier = Modifier.fillMaxSize()
                        ){
                            items(notice.get ?: emptyList(), key = {it.id}){item->

                                if(archive.find { it.story_id == item.story_id } == null){
                                    val dismissState = rememberDismissState(
                                        confirmStateChange = {
                                            if (it == DismissValue.DismissedToStart){
                                                mainViewModel.deleteNotice(item)
                                            }
                                            true
                                        }
                                    )

                                    SwipeToDismiss(
                                        state = dismissState,
                                        background = {
                                            val direction = dismissState.dismissDirection ?: return@SwipeToDismiss

                                            val color by animateColorAsState(
                                                targetValue = when(dismissState.targetValue){
                                                    DismissValue.Default -> Color.LightGray
                                                    DismissValue.DismissedToStart -> Color.Red
                                                    else -> MaterialTheme.colors.background
                                                }
                                            )

                                            val icon = when(direction){
                                                DismissDirection.EndToStart -> Icons.Rounded.Delete
                                                else -> Icons.Rounded.Delete
                                            }

                                            val scale by animateFloatAsState(
                                                targetValue = if(dismissState.targetValue == DismissValue.Default) 0.8f else 1.2f
                                            )

                                            val alignment = when(direction){
                                                DismissDirection.EndToStart -> Alignment.CenterEnd
                                                else-> Alignment.CenterEnd
                                            }

                                            Box(
                                                modifier = Modifier
                                                    .fillParentMaxSize()
                                                    .padding(horizontal = 12.dp)
                                                    .background(color),
                                                contentAlignment = alignment
                                            ){
                                                Icon(
                                                    modifier = Modifier.scale(scale),
                                                    imageVector = icon,
                                                    contentDescription = "Delete Icon"
                                                )
                                            }

                                        },
                                        directions = setOf(DismissDirection.EndToStart)
                                    ) {
                                        Card(
                                            modifier = Modifier.fillMaxWidth(),
                                            elevation = 0.dp,
                                            onClick = {
                                                navHostController.navigate(Destination.DETAIL_NOTICE.screenRoute + "/${item.id}")
                                            }
                                        ) {
                                            ItemNoticeList(item = item)
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }

            if (showSnackbar) {
                LaunchedEffect(
                    key1 = state.snackbarHostState,
                    block = {
                        state.snackbarHostState.showSnackbar(
                            message = "Ha ocurrido un error inesperado, compruebe su conexi??n o intente nuevamente",
                            duration = SnackbarDuration.Short
                        )
                        showSnackbar = false
                    }
                )
            }

            SnackBarCustom(
                snackBarHostState = state.snackbarHostState,
                modifier = Modifier.align(Alignment.BottomCenter),
                icon = Icons.Filled.Warning,
                tintIcon = orange,
                colorText = orange
            )
        }
    }


}