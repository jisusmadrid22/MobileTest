package com.yzdev.mobiletest.presentation.screens.detailWeb

import android.util.Log
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.runtime.produceState
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.yzdev.mobiletest.MainViewModel
import com.yzdev.mobiletest.R
import com.yzdev.mobiletest.domain.model.entities.NoticeEntity

@Composable
fun DetailWebLayout(
    idItem: Int,
    mainViewModel: MainViewModel = hiltViewModel(),
    navHostController: NavHostController
) {

    Log.d("DETAIL", "id-> $idItem")

    val item = produceState<NoticeEntity?>(
        initialValue = null,
        producer = {
            val query = mainViewModel.getNoticeById(idItem)

            value = query
        }
    )

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            TopAppBar(
                elevation = 0.dp,
                title = {
                    Text(
                        text = stringResource(id = R.string.titleApp)
                    )
                },
                navigationIcon = {
                    IconButton(
                        onClick = {
                            navHostController.popBackStack()
                        }
                    ) {
                        Icon(
                            imageVector = Icons.Rounded.ArrowBack,
                            contentDescription = "Back to List"
                        )
                    }
                },
            )
        }

    ) {
        item.value?.let { it1 -> WebViewPage(url = it1.url) }
    }
}

@Composable
fun WebViewPage(url: String){
    // Adding a WebView inside AndroidView
    // with layout as full screen
    AndroidView(factory = {
        WebView(it).apply {
            layoutParams = ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
            )
            webViewClient = WebViewClient()
            loadUrl(url)
        }
    }, update = {
        it.loadUrl(url)
    })

}