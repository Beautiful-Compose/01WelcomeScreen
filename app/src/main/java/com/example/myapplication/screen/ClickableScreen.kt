package com.example.myapplication.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme

@Composable
fun ClickableScreen() {
    val count = remember { mutableStateOf(0) }

    MyApplicationTheme() {
        Surface(color = Color.Red) {
            Box(
                Modifier
                    .fillMaxSize()
                    .background(Color.LightGray)
                    .pointerInput(Unit) {
                        detectTapGestures(
                            onTap = {
                                println("On Tap")
                                count.value += 1
                            }
                        )
                    }
//                    .clickable { count.value += 1 }
            ) {
                Box(
                    Modifier
                        .align(Alignment.Center)
                ) {
                    Text(text = "Hello Counter ${count.value}", style = MaterialTheme.typography.h5)
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ClickableScreen()
}