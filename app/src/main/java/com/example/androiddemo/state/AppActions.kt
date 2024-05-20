package com.example.androiddemo.state

sealed interface AppActions {
    data object Increment : AppActions
    data object Decrement : AppActions
}