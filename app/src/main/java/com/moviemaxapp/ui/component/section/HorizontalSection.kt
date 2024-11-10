package com.moviemaxapp.ui.component.section

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PageSize
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.dp
import com.moviemaxapp.data.MovieThumbnailState
import com.moviemaxapp.ui.component.MovieThumbnail
import com.moviemaxapp.ui.component.SectionHeader

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HorizontalSection(
    modifier: Modifier = Modifier,
    data: List<MovieThumbnailState>,
    name: String
) {

    val pagerState = rememberPagerState(pageCount = { data.size })

    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        SectionHeader(text = name, modifier = Modifier.padding(18.dp))
        HorizontalPager(state = pagerState, pageSize = TwoPagesPerViewport, pageSpacing = 18.dp, contentPadding = PaddingValues(horizontal = 18.dp)) {
            MovieThumbnail(imgRes = data[it].imgRes, modifier = Modifier.fillMaxWidth())
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
private val TwoPagesPerViewport = object : PageSize {
    override fun Density.calculateMainAxisPageSize(
        availableSpace: Int,
        pageSpacing: Int
    ): Int {
        return (availableSpace - pageSpacing) / 2
    }
}