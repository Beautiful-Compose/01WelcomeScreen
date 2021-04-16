package com.example.myapplication.navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun Screen3() {
    Box(
        Modifier
            .fillMaxSize()
            .background(Color.Yellow)
    ) {
        Text(text = "Screen 3", style = MaterialTheme.typography.h3)
    }
}