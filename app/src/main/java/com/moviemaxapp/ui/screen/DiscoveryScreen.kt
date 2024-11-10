package com.moviemaxapp.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.moviemaxapp.data.DiscoverScreenState
import com.moviemaxapp.ui.component.section.ComingSoonSection
import com.moviemaxapp.ui.component.section.FeaturedMoviesSection
import com.moviemaxapp.ui.component.section.HorizontalSection
import com.moviemaxapp.ui.theme.MovieMaxAppTheme

@Composable
fun DiscoveryScreen(modifier: Modifier = Modifier, screenState: DiscoverScreenState) {

    val scrollableState = rememberScrollState()

    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(scrollableState),
        verticalArrangement = Arrangement.spacedBy(24.dp)
    ) {
        FeaturedMoviesSection(data = screenState.featuredMovies)
        ComingSoonSection(
            data = screenState.upcomingMovies,
            modifier = Modifier.padding(horizontal = 18.dp)
        )
        HorizontalSection(data = screenState.recentlyWatchedMovies, name = "Recently Watched")
        HorizontalSection(data = screenState.trendingMovies, name = "Trending Movies")
    }
}

@Preview
@Composable
private fun DiscoveryScreenPreview() {
    MovieMaxAppTheme {
        DiscoveryScreen(screenState = DiscoverScreenState())
    }
}