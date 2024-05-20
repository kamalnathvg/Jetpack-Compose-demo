package com.example.androiddemo.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.androiddemo.state.AppActions
import com.example.androiddemo.state.AppState
import org.reduxkotlin.Dispatcher
import org.reduxkotlin.compose.rememberDispatcher
import org.reduxkotlin.compose.selectState

@Composable
fun HomePage(
    onNavigateToSecondPage : () ->Unit,
    onNavigateToThirdPage : () -> Unit,
){
   Column (
       modifier = Modifier.fillMaxSize().background(Color.DarkGray),
       verticalArrangement = Arrangement.SpaceEvenly,
       horizontalAlignment = Alignment.CenterHorizontally,
   ){
       Text(text = "Home Page")
       CounterApp()
       Button(
           onClick = {onNavigateToSecondPage()}) {
            Text(text = "Second Page") 
       }
       Button(onClick = {onNavigateToThirdPage()}) {
            Text(text = "Third Page")
       }
   } 
}



@Composable
fun CounterApp(){
    val count by selectState <AppState,Int>{count}
    val dispatch = rememberDispatcher()
    Row (
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically,
    ){
        Button(onClick = { dispatch(AppActions.Decrement) }) {
            Text(text = "-")
        }
        Text(text = "$count")
        Button(onClick = {dispatch(AppActions.Increment)}) {
           Text(text = "+")
        }
    }
}