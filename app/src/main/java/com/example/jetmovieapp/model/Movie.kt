package com.example.jetmovieapp.model

data class Movie(
	val movieId: String,
	val title: String,
	val year: String,
	val genre: String,
	val director: String,
	val actors: String,
	val plot: String,
	val poster: String,
	val images: List<String>,
	val rating: String,
)

fun getMovies(): List<Movie> {
	return listOf(
		Movie(
			movieId = "1xx258",
			title = "inception",
			year = "2010",
			genre = "mistery",
			director = "nolan",
			actors = "Leonardo DiCaprio",
			plot = "somethin' bout dreaming",
			poster = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcQ1wNJi3WBo8wjZ-lxg4xPbg6-X7tQ1w6ZFI5L-RH1rUiOOGxLO",
			images = listOf(
				"https://www.google.com/images/branding/googlelogo/2x/googlelogo_color_92x30dp.png",
				"https://www.google.com/images/branding/googlelogo/2x/googlelogo_color_92x30dp.png",
				"https://www.google.com/images/branding/googlelogo/2x/googlelogo_color_92x30dp.png"
			),
			rating = "8.8"
		),
		Movie(
			movieId = "1xx579",
			title = "My Neighbor Totoro\n",
			year = "1988",
			genre = "fantasy",
			director = "Hayao Miyazaki",
			actors = "Dakota Fanning",
			plot = "My Neighbor Totoro is a 1988 Japanese animated fantasy film written and directed by Hayao Miyazaki and animated by Studio Ghibli for Tokuma Shoten",
			poster = "https://m.media-amazon.com/images/I/51c1GhIFi8L._AC_SY780_.jpg",
			images = listOf(
				"https://www.google.com/images/branding/googlelogo/2x/googlelogo_color_92x30dp.png",
				"https://www.google.com/images/branding/googlelogo/2x/googlelogo_color_92x30dp.png",
				"https://www.google.com/images/branding/googlelogo/2x/googlelogo_color_92x30dp.png"
			),
			rating = "8.1"
		),
		Movie(
			movieId = "1xx794",
			title = "inception",
			year = "2010",
			genre = "mistery",
			director = "nolan",
			actors = "Leonardo DiCaprio",
			plot = "somethin' bout dreaming",
			poster = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcQ1wNJi3WBo8wjZ-lxg4xPbg6-X7tQ1w6ZFI5L-RH1rUiOOGxLO",
			images = listOf(
				"https://www.google.com/images/branding/googlelogo/2x/googlelogo_color_92x30dp.png",
				"https://www.google.com/images/branding/googlelogo/2x/googlelogo_color_92x30dp.png",
				"https://www.google.com/images/branding/googlelogo/2x/googlelogo_color_92x30dp.png"
			),
			rating = "8.8"
		),
	)
}