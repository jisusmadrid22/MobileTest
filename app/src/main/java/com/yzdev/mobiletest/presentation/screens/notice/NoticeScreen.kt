package com.yzdev.mobiletest.presentation.screens.notice

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
import androidx.compose.material.icons.rounded.Delete
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.google.accompanist.swiperefresh.SwipeRefresh
import com.google.accompanist.swiperefresh.rememberSwipeRefreshState
import com.yzdev.mobiletest.MainViewModel
import com.yzdev.mobiletest.R
import com.yzdev.mobiletest.data.repository.UiStatus
import com.yzdev.mobiletest.presentation.composable.itemListDesign.noticeItemList.ItemNoticeList
import com.yzdev.mobiletest.presentation.composable.shimmerEffect.AnimatedShimmerTwoLines
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun NoticeLayout(
    mainViewModel: MainViewModel = hiltViewModel()
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

    Scaffold(
        modifier = Modifier.fillMaxSize(),
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
            when(notice){
                is UiStatus.Failure -> {
                    Text(text = "ERROR -> ${notice.message} ${notice.get}")
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
                                        elevation = animateDpAsState(targetValue = if (dismissState.dismissDirection != null) 4.dp else 0.dp).value
                                    ) {
                                        ItemNoticeList(item = item.title)
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }


}