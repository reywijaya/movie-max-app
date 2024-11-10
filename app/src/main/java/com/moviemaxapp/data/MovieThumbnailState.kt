package com.moviemaxapp.data

import androidx.annotation.DrawableRes
import com.moviemaxapp.R

data class MovieThumbnailState(
    val id: Int,
    @DrawableRes val imgRes: Int
)

val UpcomingMoviesData = listOf(
    MovieThumbnailState(0, R.drawable.img_movie_poster_2),
    MovieThumbnailState(1, R.drawable.img_movie_poster_0),
    MovieThumbnailState(2, R.drawable.img_movie_poster_1),
    MovieThumbnailState(3, R.drawable.img_movie_poster_4)
)

val RecentlyWatchedMoviesData = listOf(
    MovieThumbnailState(0, R.drawable.img_movie_poster_2),
    MovieThumbnailState(1, R.drawable.img_movie_poster_0),
    MovieThumbnailState(2, R.drawable.img_movie_poster_1),
    MovieThumbnailState(3, R.drawable.img_movie_poster_6)
)

val TrendingMoviesData = listOf(
    MovieThumbnailState(0, R.drawable.img_movie_poster_2),
    MovieThumbnailState(1, R.drawable.img_movie_poster_5),
    MovieThumbnailState(2, R.drawable.img_movie_poster_7),
    MovieThumbnailState(3, R.drawable.img_movie_poster_8)
)