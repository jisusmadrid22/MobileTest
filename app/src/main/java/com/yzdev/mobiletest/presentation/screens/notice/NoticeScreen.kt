package com.yzdev.mobiletest.presentation.screens.notice

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.yzdev.mobiletest.presentation.composable.itemListDesign.noticeItemList.ItemNoticeList

@Composable
fun NoticeLayout(

) {
    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ){
        items(setList(), key = {it.id}){
            ItemNoticeList(item = it.title)
        }
    }
}

data class NoticeList(
    var id: Int,
    var title: String
)

private fun setList(): List<NoticeList>{
    return listOf(
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