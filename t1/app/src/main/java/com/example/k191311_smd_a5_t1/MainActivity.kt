package com.example.k191311_smd_a5_t1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ButtonCounter()
                }
            }
        }
    }
}

@Composable
fun ButtonCounter() {
    val count = remember { mutableStateOf(0) }
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        Text(
            text = "${count.value}"
        )
        Spacer(Modifier.height(52.dp))
        Button(
            onClick = { count.value++ },
            modifier = Modifier.padding(16.dp),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = MaterialTheme.colors.onSurface.copy(alpha = 0.2f)
            )
        ) {
            Text("TAP")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ButtonCounterPreview() {
    TTheme {
        ButtonCounter()
    }
}

@Composable
fun TTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        content = content
    )
}
