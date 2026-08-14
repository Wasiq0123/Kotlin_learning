package com.example.kotin_practice.navigationbar

import kotlinx.serialization.Serializable

@Serializable
sealed class NavBarNavigation{


    //define eash class  Seriazble
    @Serializable
    object  HomeScreenNavroutes: NavBarNavigation()
    @Serializable
    object  SearchScreenNavroutes: NavBarNavigation()
    @Serializable
    object  NatificationsScreenNavroutes: NavBarNavigation()
    @Serializable
    object  ProfileScreenNavroutes: NavBarNavigation()
}