package com.example.myapplication.navigation

import Screen2
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigate
import androidx.navigation.compose.rememberNavController

@Composable
fun HostScreen() {
    val navController = rememberNavController()

    Column() {
        Row() {
            Button(onClick = { navController.navigate("screen1") }) {
                Text("Screen 1")
            }
            Button(onClick = { navController.navigate("screen2") }) {
                Text("Screen 2")
            }
            Button(onClick = { navController.navigate("screen3") }) {
                Text("Screen 3")
            }
            Button(onClick = { navController.navigate("screen4") }) {
                Text("Screen 4")
            }
        }
        Column(Modifier.weight(1f)) {
            NavHost(
                navController = navController,
                startDestination = "screen1"
            ) {
                composable("screen1") {
                    Screen1()
                }
                composable("screen2") {
                    Screen2()
                }
                composable("screen3") {
                    Screen3()
                }
                composable("screen4") {
                    Screen4()
                }
            }
        }
    }
}