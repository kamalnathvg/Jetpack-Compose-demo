package com.example.androiddemo.nav

import androidx.compose.runtime.Composable
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.androiddemo.nav.AppNavRoutes
import com.example.androiddemo.screens.HomePage
import com.example.androiddemo.screens.SecondPage
import com.example.androiddemo.screens.ThirdPage

@Composable
fun AppNavHost(navController: NavHostController){
    NavHost(navController = navController, startDestination = AppNavRoutes.HOMEPAGE_ROUTE) {
        composable(AppNavRoutes.HOMEPAGE_ROUTE){
            HomePage(
                onNavigateToSecondPage = { navController.navigate(AppNavRoutes.SECOND_PAGE_ROUTE) },
                onNavigateToThirdPage = {navController.navigate(AppNavRoutes.THIRD_PAGE_ROUTE)},
                )
        }

        composable(AppNavRoutes.SECOND_PAGE_ROUTE){
            SecondPage(
                onNavigateToHomePage = {navController.navigate(AppNavRoutes.HOMEPAGE_ROUTE)},
                onNavigateToThirdPage = {navController.navigate(AppNavRoutes.THIRD_PAGE_ROUTE)},
                )
        }

        composable(AppNavRoutes.THIRD_PAGE_ROUTE){
            ThirdPage(
                onNavigateToHomePage = { navController.navigate(AppNavRoutes.HOMEPAGE_ROUTE) },
                onNavigateToSecondPage = {navController.navigate(AppNavRoutes.SECOND_PAGE_ROUTE)}
                )
        }
    }
}