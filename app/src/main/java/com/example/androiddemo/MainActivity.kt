package com.example.androiddemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.example.androiddemo.nav.AppNavHost
import com.example.androiddemo.state.AppState
import com.example.androiddemo.state.appReducer
import com.example.androiddemo.ui.theme.AndroidDemoTheme
import org.reduxkotlin.compose.StoreProvider
import org.reduxkotlin.createStore

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidDemoTheme {
                // A surface container using the 'background' color from the theme
                StoreProvider(store = createStore(appReducer, AppState(0))) {
                    Surface(
                        modifier = Modifier.fillMaxSize(),
                        color = MaterialTheme.colorScheme.background
                    ) {
                        val navController = rememberNavController()
                        AppNavHost(navController = navController)
                    }
                }
            }
        }
    }
}
