package com.example.t2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.t2.ui.theme.T2Theme



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            T2Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    FruitList()
                }
            }
        }
    }
}


val fruitList = listOf(
    "APPLE",
    "BANANA",
    "ORANGE",
    "STRAWBERRY",
    "MANGO",
    "cherry"
)

@Composable
fun FruitList() {
    LazyColumn(Modifier.fillMaxSize()) {
        items(fruitList) { fruit ->
            Text(text = "Name: "+fruit)
        }
    }
}