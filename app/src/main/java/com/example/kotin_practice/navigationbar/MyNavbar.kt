package com.example.kotin_practice.navigationbar

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.input.key.Key
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.savedstate.SavedState

@Composable
fun MyNavBar(navController: NavController, key: String) {
//Here is the list i itteate each item and pass the Navbaritem
    var item = listOf(
        MyNaItem(
            title = "Home",
            Icon = Icons.Default.Home,
            route = NavBarNavigation.HomeScreenNavroutes
        ),
        MyNaItem(
            title = "Search",
            Icon = Icons.Default.Search,
            route = NavBarNavigation.SearchScreenNavroutes

        ),
        MyNaItem(
            title = "Notifications",
            Icon = Icons.Default.Notifications,
            route = NavBarNavigation.NatificationsScreenNavroutes

        ),
        MyNaItem(
            title = "Profile",
            Icon = Icons.Default.Person,
            route = NavBarNavigation.ProfileScreenNavroutes

        ),
    )

    NavigationBar() {
        //In this navigation bar item we copy and paste again and agian item
        //But this Approch is not good i used Data class and list  make navigation dynamic

        item.forEach { index ->
            NavigationBarItem(

                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = Color.Blue,
                    selectedTextColor = Color.Blue,

                    unselectedIconColor = Color.Gray,
                    unselectedTextColor = Color.Gray,

                    indicatorColor = Color.LightGray
                ),

                selected = index.title == key,
                onClick = {

                    navController.navigate(
                        index.route,

                        ){
              //In this function help removing the Stack ,if the user tap diferernt screena and naigate
                        //then caretin the Scree t.This Function helps remove the State and navigate
                        //Start detsination
                        popUpTo(navController.graph.startDestinationId){

                            //In this fuction help Save the Sate
                            saveState=true
                        }
                        //if the user tap example profile Screen 10 time ,create 10 time Save in Stack profile SCreen
                        //Use of this fucthion Staore only one time instaed to 10 time Save.
                        launchSingleTop=true

                        //Atfer Save the State it will help restore the State.
                        restoreState=true

                    }

                },
                label = {
                    Text(index.title)
                },
                icon = {

                    Icon(
                        imageVector = index.Icon,
                        contentDescription = index.title,


                        )


                }

            )

        }

    }

}

//-Here is the data class we pass the list
data class MyNaItem(
    var title: String,
    var Icon: ImageVector,
    var route: NavBarNavigation

)