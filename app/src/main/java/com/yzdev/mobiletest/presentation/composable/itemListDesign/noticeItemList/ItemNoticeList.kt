package com.yzdev.mobiletest.presentation.composable.itemListDesign.noticeItemList

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.yzdev.mobiletest.domain.model.entities.NoticeEntity
import com.yzdev.mobiletest.presentation.ui.theme.gray

@Composable
fun ItemNoticeList(
    item: NoticeEntity
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        Text(
            text = item.title,
            style = MaterialTheme.typography.h6,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.padding(4.dp))

        Row {
            Text(
                text = item.author,
                style = MaterialTheme.typography.subtitle2.copy(color = gray.copy(alpha = 0.65f)),
                fontWeight = FontWeight.Light
            )

            Text(
                text = " - ",
                style = MaterialTheme.typography.subtitle2.copy(color = gray.copy(alpha = 0.65f)),
                fontWeight = FontWeight.Light
            )

            Text(
                text = item.createdAt,
                style = MaterialTheme.typography.subtitle2.copy(color = gray.copy(alpha = 0.65f)),
                fontWeight = FontWeight.Light
            )
        }

        Spacer(modifier = Modifier.fillMaxWidth().height(7.dp).padding(top = 4.dp, bottom = 2.dp).background(Color.Black))
    }
}