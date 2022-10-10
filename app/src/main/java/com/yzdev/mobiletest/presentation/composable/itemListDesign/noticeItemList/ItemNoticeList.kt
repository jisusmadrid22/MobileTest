package com.yzdev.mobiletest.presentation.composable.itemListDesign.noticeItemList

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ItemNoticeList(
    item: String
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(64.dp)
    ) {
        Text(text = item)
    }
}