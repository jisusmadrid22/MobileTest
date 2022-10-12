package com.yzdev.mobiletest.presentation.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AccountCircle
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.List
import androidx.compose.material.icons.rounded.ShoppingCart
import androidx.compose.ui.graphics.vector.ImageVector
import com.yzdev.mobiletest.R

enum class Destination(val screenRoute: String, val title: String, val icon: ImageVector) {
    HOME(
        screenRoute = "MOBILETEST:SCREEN_HOME",
        title = "Home",
        icon = Icons.Rounded.Home
    ),
    DETAIL_NOTICE(
        screenRoute = "MOBILETEST:SCREEN_DETAIL_NOTICE",
        title = "Detail",
        icon = Icons.Rounded.List
    ),
}