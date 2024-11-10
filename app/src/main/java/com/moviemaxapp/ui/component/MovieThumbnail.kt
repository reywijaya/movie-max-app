package com.moviemaxapp.ui.component

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun MovieThumbnail(modifier: Modifier = Modifier, @DrawableRes imgRes: Int) {
    Image(
        painter = painterResource(imgRes),
        contentScale = ContentScale.Crop,
        contentDescription = null,
        modifier = modifier.height(240.dp)
    )
}