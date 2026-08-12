package com.example.kotin_practice.ui.theme.navigation

import kotlinx.serialization.Serializable

@Serializable
sealed class MyNavRoutes{
    @Serializable
    object   LoginScreen : MyNavRoutes()
    @Serializable
    object   HomeScreen :  MyNavRoutes()

    //if i pass the Arugement then i will define data class
    @Serializable
    data class  Dashborad(val username: String): MyNavRoutes()
}