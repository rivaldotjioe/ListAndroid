package com.rivaldo.listandroid.ui.navigation

val HOME = "home"
val DETAIL = "detail"
val ABOUT = "about"
val ID_ANDROID = "id_android"
sealed class Screen(val route: String) {
    object Home: Screen(HOME)
    object Detail: Screen(DETAIL+"/{$ID_ANDROID}") {
        fun createRoute(id: Int) = DETAIL+"/$id"
    }

    object About: Screen(ABOUT)
}
