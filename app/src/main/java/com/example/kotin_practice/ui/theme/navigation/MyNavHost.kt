package com.example.kotin_practice.ui.theme.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute


@Composable
 fun MyNavHost() {
    //define controller
     var navController = rememberNavController()


    NavHost(
        navController = navController,
        startDestination = MyNavRoutes.LoginScreen
    ){
        composable<MyNavRoutes.LoginScreen> {
            LoginScreenExample(navController)
        }

        composable <MyNavRoutes.HomeScreen>{
            HomeClassExample(navController)
        }

        composable <MyNavRoutes.Dashborad>{ a->
            var data=a.toRoute<MyNavRoutes.Dashborad>()
            DashboardUI(data.username)

        }
    }
}