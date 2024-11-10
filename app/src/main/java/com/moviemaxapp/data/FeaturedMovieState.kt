package com.moviemaxapp.data

import androidx.annotation.DrawableRes
import com.moviemaxapp.R

data class FeaturedMovieState(
    val id: Int,
    @DrawableRes val imgRes: Int,
    val title: String,
    val description: String,
    val timeSlots: List<String>
)

val FeaturedMoviesData = listOf(
    FeaturedMovieState(
        id = 0,
        imgRes = R.drawable.img_movie_poster_2,
        title = "Parasite",
        description = "All un-employed, Kit-Taek and his family take peculiar interest in the wealthy and glamorous Parks.",
        timeSlots = listOf(
            "3:30 PM",
            "6:00 PM",
            "8:30 PM",
        )
    ),
    FeaturedMovieState(
        id = 1,
        imgRes = R.drawable.img_movie_poster_0,
        title = "Frozen II",
        description = "Anna, Elsa, Kristof, Olaf and Sven leave Arendelle to travel to an ancient, autumn bond forrest..",
        timeSlots = listOf(
            "11:00 AM",
            "2:00 PM",
            "4:00 PM",
        )
    ),
    FeaturedMovieState(
        id = 2,
        imgRes = R.drawable.img_movie_poster_4,
        title = "Weathering with You",
        description = "A high school boy who has run away to Tokyo befriends a girl who appears to be able to change the weather.",
        timeSlots = listOf(
            "3:30 PM",
            "6:00 PM",
            "8:30 PM",
        )
    ),
    FeaturedMovieState(
        id = 3,
        imgRes = R.drawable.img_movie_poster_3,
        title = "Midway",
        description = "The historic story of the Battle of Midway, told by the Leaders and the sailors who fought in it.",
        timeSlots = listOf(
            "3:30 PM",
            "6:00 PM",
            "8:30 PM",
        )
    ),
    FeaturedMovieState(
        id = 4,
        imgRes = R.drawable.img_movie_poster_2,
        title = "Parasite",
        description = "All un-employed, Kit-Taek and his family take peculiar interest in the wealthy and glamorous Parks.",
        timeSlots = listOf(
            "3:30 PM",
            "6:00 PM",
            "8:30 PM",
        )
    ),
    FeaturedMovieState(
        id = 5,
        imgRes = R.drawable.img_movie_poster_2,
        title = "Parasite",
        description = "All un-employed, Kit-Taek and his family take peculiar interest in the wealthy and glamorous Parks.",
        timeSlots = listOf(
            "3:30 PM",
            "6:00 PM",
            "8:30 PM",
        )
    ),
    FeaturedMovieState(
        id = 6,
        imgRes = R.drawable.img_movie_poster_2,
        title = "Parasite",
        description = "All un-employed, Kit-Taek and his family take peculiar interest in the wealthy and glamorous Parks.",
        timeSlots = listOf(
            "3:30 PM",
            "6:00 PM",
            "8:30 PM",
        )
    ),
    FeaturedMovieState(
        id = 7,
        imgRes = R.drawable.img_movie_poster_2,
        title = "Parasite",
        description = "All un-employed, Kit-Taek and his family take peculiar interest in the wealthy and glamorous Parks.",
        timeSlots = listOf(
            "3:30 PM",
            "6:00 PM",
            "8:30 PM",
        )
    ),
    FeaturedMovieState(
        id = 8,
        imgRes = R.drawable.img_movie_poster_2,
        title = "Parasite",
        description = "All un-employed, Kit-Taek and his family take peculiar interest in the wealthy and glamorous Parks.",
        timeSlots = listOf(
            "3:30 PM",
            "6:00 PM",
            "8:30 PM",
        )
    )
)