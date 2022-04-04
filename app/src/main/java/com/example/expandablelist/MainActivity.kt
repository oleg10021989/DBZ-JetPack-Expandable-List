package com.example.expandablelist

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import com.example.expandablelist.cards.CardsScreen
import com.example.expandablelist.cards.CardsViewModel
import com.example.expandablelist.theme.AppTheme

class MainActivity : AppCompatActivity() {
    private val cardsViewModel by viewModels<CardsViewModel>()

    @ExperimentalFoundationApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppTheme {
                Surface(color = MaterialTheme.colors.background) { CardsScreen(cardsViewModel) }
            }
        }
    }
}

