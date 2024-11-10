package com.moviemaxapp.data

data class DiscoverScreenState(
    val featuredMovies: List<FeaturedMovieState> = FeaturedMoviesData,
    val upcomingMovies: List<MovieThumbnailState> = UpcomingMoviesData,
    val recentlyWatchedMovies: List<MovieThumbnailState> = RecentlyWatchedMoviesData,
    val trendingMovies: List<MovieThumbnailState> = TrendingMoviesData
)
