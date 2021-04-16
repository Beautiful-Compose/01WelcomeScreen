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
fun Screen4() {
    Box(
        Modifier
            .fillMaxSize()
            .background(Color.Gray)
    ) {
        Text(text = "Screen 4", style = MaterialTheme.typography.h3)
    }
}