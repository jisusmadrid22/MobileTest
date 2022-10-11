package com.yzdev.mobiletest.presentation.navigation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.navigation.NavType
import androidx.navigation.Navigation
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.yzdev.mobiletest.presentation.screens.detailWeb.DetailWebLayout
import com.yzdev.mobiletest.presentation.screens.notice.NoticeLayout

@Composable
fun Navigation() {
    val scope = rememberCoroutineScope()
    val navigation = rememberNavController()

    NavHost(
        navController = navigation,
        startDestination = Destination.HOME.screenRoute,
        builder = {
            /** HOME*/
            composable(
                route = Destination.HOME.screenRoute,
            ) {
                Box(
                    modifier = Modifier.fillMaxSize()
                ) {
                    NoticeLayout(
                        navHostController = navigation
                    )
                }
            }

            /** Details notice*/
            composable(
                route = Destination.DETAIL_NOTICE.screenRoute + "/{id}",
                arguments = listOf(
                    navArgument("id"){type = NavType.IntType}
                )
            ) {
                Box(
                    modifier = Modifier.fillMaxSize()
                ) {
                    DetailWebLayout(idItem = it.arguments!!.getInt("id"), navHostController = navigation)
                }
            }
        }
    )
}