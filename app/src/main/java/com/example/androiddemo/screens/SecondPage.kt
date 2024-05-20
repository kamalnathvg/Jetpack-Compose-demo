package com.example.androiddemo.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun SecondPage(
    onNavigateToHomePage : () -> Unit,
    onNavigateToThirdPage : () -> Unit,
){
    Column (
        modifier = Modifier.fillMaxSize().background(Color.LightGray),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(text = "Welcome to Second Page")
        CounterApp()
        Button(
            onClick = { onNavigateToHomePage() }) {
            Text(text = "HomePage")
        }
        Button(onClick = { onNavigateToThirdPage() }) {
            Text(text = "Third Page")
        }
    }
}