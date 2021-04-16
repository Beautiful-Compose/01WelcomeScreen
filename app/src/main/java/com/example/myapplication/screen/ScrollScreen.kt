package com.example.myapplication.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.animateScrollBy
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch

@Composable
fun ScrollScreen() {
    val scrollState = rememberScrollState()
    val scope = rememberCoroutineScope()

    Column() {
        Column(
            modifier = Modifier
                .background(Color.LightGray)
                .weight(1f)
                .fillMaxWidth()
                .verticalScroll(scrollState)
        ) {
            repeat(100) {
                Text("Item $it", modifier = Modifier.padding(2.dp))
            }
        }

        Row(modifier = Modifier.height(70.dp)) {
            Button(onClick = {
                scope.launch { scrollState.animateScrollTo(0) }
            }) {
                Text("Start")
            }
            Button(onClick = {
                scope.launch { scrollState.animateScrollTo(scrollState.maxValue) }
            }) {
                Text("END")
            }
        }
    }
}