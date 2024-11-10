package com.moviemaxapp.ui.component.section

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.moviemaxapp.data.FeaturedMovieState
import com.moviemaxapp.ui.component.SectionHeader

@Composable
fun FeaturedMoviesSection(modifier: Modifier = Modifier, data: List<FeaturedMovieState>) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(24.dp)
    ) {
        SectionHeader(text = "Featured Movies", modifier = Modifier.padding(horizontal = 18.dp))
        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            contentPadding = PaddingValues(horizontal = 18.dp)
        ) {
            items(
                items = data,
                key = { it.id }
            ) {
                FeaturedMovies(item = it)
            }
        }
    }
}

@Composable
fun FeaturedMovies(modifier: Modifier = Modifier, item: FeaturedMovieState) {
    Column(
        modifier = modifier.width(224.dp)
    ) {
        Image(
            painter = painterResource(item.imgRes),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .height(324.dp)
        )
        Spacer(modifier = Modifier.heightIn(8.dp))
        Text(
            text = item.title,
            overflow = TextOverflow.Ellipsis,
            maxLines = 1,
            style = MaterialTheme.typography.titleMedium
        )
        Spacer(modifier = Modifier.heightIn(8.dp))
        Text(
            text = item.description,
            overflow = TextOverflow.Ellipsis,
            maxLines = 3,
            style = MaterialTheme.typography.bodySmall
        )
        Spacer(modifier = Modifier.heightIn(18.dp))
        TimeSlotsSection(slots = item.timeSlots)
    }
}

@Composable
fun TimeSlotsSection(modifier: Modifier = Modifier, slots: List<String>) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        slots.onEach { TimeSlotItem(slot = it) }
    }
}

@Composable
fun TimeSlotItem(modifier: Modifier = Modifier, slot: String) {
    Surface(
        modifier = modifier,
        shape = RoundedCornerShape(8.dp)
    ) {
        Text(
            text = slot,
            style = MaterialTheme.typography.bodySmall,
            modifier = Modifier
                .padding(8.dp)
        )
    }
}