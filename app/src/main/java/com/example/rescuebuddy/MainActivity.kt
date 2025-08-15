package com.example.rescuebuddy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.rescuebuddy.screens.RescueGuideApp
import com.example.rescuebuddy.ui.theme.RescueBuddyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RescueBuddyTheme {
                RescueGuideApp()
            }
        }
    }
}


