package com.example.androiddemo.state

import org.reduxkotlin.Reducer
import org.reduxkotlin.typedReducer

val appReducer : Reducer<AppState> = typedReducer<AppState,AppActions>{ state, action ->
   when(action) {
      is AppActions.Increment -> state.copy(count = state.count + 1)
       is AppActions.Decrement -> state.copy(count = state.count - 1)
   }
}