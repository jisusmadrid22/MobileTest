package com.yzdev.mobiletest.presentation.composable.snackBarDesign

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

/**
 * SnackBarCustom es una instancia del snackbar pero personalizado, en donde el parametro modifier es para establecer
 * estilos del modifier, o posicionamiento, snackBarHost debe ser el estado del snackbar, el snackbarCustom debe ser llamado
 * en el mommento que se muestre el snackBar por el snackBarHostState
 * SnackBarCustom es para personalizar el snackBar que se vaya a mostrar
 * */
@Composable
fun SnackBarCustom(
    snackBarHostState: SnackbarHostState,
    modifier: Modifier = Modifier,
    icon: ImageVector,
    tintIcon: Color,
    colorText: Color,
    buttonClick: () -> Unit = {},
    textColorButton: Color = Color.Unspecified
) {
    SnackbarHost(
        hostState = snackBarHostState,
        modifier = modifier
            .fillMaxWidth()
            .wrapContentHeight(align = Alignment.Bottom),
        snackbar = {
            Snackbar(
                modifier = Modifier.padding(16.dp),
                content = {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            imageVector = icon,
                            contentDescription = it.message,
                            tint = tintIcon
                        )
                        Spacer(modifier = Modifier.padding(4.dp))
                        Text(
                            text = it.message,
                            style = MaterialTheme.typography.caption,
                            textAlign = TextAlign.Center,
                            color = colorText
                        )
                    }
                },
                action = {
                    it.actionLabel?.let { actionLabel ->
                        TextButton(
                            onClick = {
                                buttonClick()
                            }
                        ) {
                            Text(
                                text = actionLabel,
                                color = textColorButton,
                                style = MaterialTheme.typography.button
                            )
                        }
                    }
                }/*,
                backgroundColor = if (isSystemInDarkTheme()) {
                    MaterialTheme.colors.surface
                } else {
                    SnackbarDefaults.backgroundColor
                }*/
            )
        }
    )
}