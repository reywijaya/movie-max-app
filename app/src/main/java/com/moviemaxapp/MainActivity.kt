package com.moviemaxapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.moviemaxapp.data.DiscoverScreenState
import com.moviemaxapp.ui.screen.DiscoveryScreen
import com.moviemaxapp.ui.theme.MovieMaxAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MovieMaxAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    DiscoveryScreen(
                        modifier = Modifier.padding(innerPadding),
                        screenState = DiscoverScreenState()
                    )
                }
            }
        }
    }
}