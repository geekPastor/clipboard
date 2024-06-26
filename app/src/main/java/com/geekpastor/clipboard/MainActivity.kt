package com.geekpastor.clipboard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.geekpastor.clipboard.ui.screens.homeScreen.MainHomeScreen
import com.geekpastor.clipboard.ui.theme.ClipboardTheme
import com.geekpastor.clipboard.util.MultiPreview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ClipboardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //Greeting("Android")
                    MainHomeScreen()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    MainHomeScreen()
}


@MultiPreview
@Composable
fun GreetingPreview() {
    ClipboardTheme {
        Greeting()
    }
}