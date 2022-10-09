package com.example.jetmovieapp.screens.detail

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@Composable
fun DetailScreen(navController: NavController, movieData: String?) {
	Surface(
		modifier = Modifier
			.fillMaxHeight()
			.fillMaxWidth(),
	) {
		Column(
			horizontalAlignment = Alignment.CenterHorizontally,
			verticalArrangement = Arrangement.Center
		) {
			
			Text(text = movieData.toString(), style = MaterialTheme.typography.h5)
			
		}
		
	}
}