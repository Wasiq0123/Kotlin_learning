package com.example.kotin_practice.navigationbar

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.kotin_practice.ui.theme.navigation.MyNavRoutes


@Composable
 fun  MyNvagraphNavItems() {

     //first we define the controller
     var navcontroller= rememberNavController()

    NavHost(
        navController = navcontroller,
        startDestination =NavBarNavigation.HomeScreenNavroutes
    ) {
        composable<NavBarNavigation.HomeScreenNavroutes> {
            HomeNavbarExample(navcontroller)
        }
        composable<NavBarNavigation.SearchScreenNavroutes> {
            SearchNavBarExample(navcontroller)
        }
        composable<NavBarNavigation.NatificationsScreenNavroutes> {
            NotificatioNabarExample(navcontroller)
        }
        composable<NavBarNavigation.ProfileScreenNavroutes> {
            ProfileNavbarExample(navcontroller)
        }

    }}