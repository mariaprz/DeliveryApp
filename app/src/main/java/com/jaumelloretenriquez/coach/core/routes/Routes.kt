package com.jaumelloretenriquez.coach.core.routes

sealed class Routes(val route: String) {
    object  SignInScreen: Routes("signInScreen")
    object  SignUpScreen: Routes("signUpScreen")
    object  HomeScreen: Routes("homeScreen/{id}?username={username}") {
        fun createRoute(id:Int, username: String) = "homeScreen/$id?username=$username"
    }
}