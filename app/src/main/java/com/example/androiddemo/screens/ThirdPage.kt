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
fun ThirdPage(
    onNavigateToHomePage : () -> Unit,
    onNavigateToSecondPage : () -> Unit,
){
    Column (
        modifier = Modifier.fillMaxSize().background(Color.White),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally,
        ){
        Text(text = "Welcome to Third Page")
        CounterApp()
        Button(onClick = {onNavigateToHomePage()}) {
           Text(text = "HomePage") 
        }
        Button(onClick = {onNavigateToSecondPage()}) {
           Text(text = "SecondPage")
        }
    }
}