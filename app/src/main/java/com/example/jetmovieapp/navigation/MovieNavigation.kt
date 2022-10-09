package com.example.jetmovieapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.jetmovieapp.screens.detail.DetailScreen
import com.example.jetmovieapp.screens.home.HomeScreen

@Composable
fun MovieNavigation() {
	val navController = rememberNavController()
	NavHost(
		navController = navController,
		startDestination = MovieScreens.HomeScreen.name
	) {
		
		composable(MovieScreens.HomeScreen.name) {
			//here we pass where this should lead us to
			HomeScreen(navController = navController)
		}
		
		composable(MovieScreens.DetailsScreen.name + "/{movie}",
				   arguments = listOf(navArgument(name = "movie") { type = NavType.StringType })
		) { backStackEntry ->
			//here we pass where this should lead us to
			DetailScreen(
				navController = navController,
				backStackEntry.arguments?.getString("movie")
			)
		}
	}
}