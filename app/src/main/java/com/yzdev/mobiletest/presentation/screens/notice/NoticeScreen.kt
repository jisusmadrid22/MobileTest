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
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.yzdev.mobiletest.MainViewModel
import com.yzdev.mobiletest.presentation.composable.itemListDesign.noticeItemList.ItemNoticeList
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun NoticeLayout(
    mainViewModel: MainViewModel = hiltViewModel()
) {

    val scope = rememberCoroutineScope()
    val list = remember {
        mutableStateListOf<NoticeList>(
            NoticeList(
                id = 1,
                title = "dd"
            ),
            NoticeList(
                id = 2,
                title = "dd"
            ),
            NoticeList(
                id = 3,
                title = "dd"
            ),
            NoticeList(
                id = 4,
                title = "dd"
            ),
            NoticeList(
                id = 5,
                title = "dd"
            ),
            NoticeList(
                id = 6,
                title = "dd"
            ),
            NoticeList(
                id = 7,
                title = "dd"
            ),
            NoticeList(
                id = 8,
                title = "dd"
            )
        )
    }

    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ){
        item{
            Button(
                onClick = {
                    scope.launch {
                        mainViewModel.getNotice()
                    }
                }
            ) {
                Text(text = "click")
            }
        }
        items(list, key = {it.id}){item->

            val dismissState = rememberDismissState(
                confirmStateChange = {
                    if (it == DismissValue.DismissedToStart){
                        list.remove(item)
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

data class NoticeList(
    var id: Int,
    var title: String
)