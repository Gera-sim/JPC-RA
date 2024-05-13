package ru.ger.jpc_ra

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.BiasAbsoluteAlignment
import androidx.compose.ui.BiasAlignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
        HelloWorld()
        }
    }
}
@Preview(
    showSystemUi = true
)
@Composable
fun HelloWorld(){
    Column(
       // verticalAlignment = Alignment.CenterVertically,
        horizontalAlignment = BiasAbsoluteAlignment.Horizontal(-0.3f),
        verticalArrangement = Arrangement.SpaceAround,
        modifier = Modifier.background(Color.Cyan)
        .fillMaxSize()
    ) {
        Text(
            "Hello World",
            fontSize = 35.sp,
            color = Color.Red,
            modifier = Modifier.background(Color.Yellow)
        )
        Text(
            "Racoon",
            fontSize = 20.sp,
            color = Color.Blue,
            modifier = Modifier.background(Color.Green)
                .align(BiasAbsoluteAlignment.Horizontal(0.6f))
        )
        Text(
            "Peace",
            fontSize = 45.sp,
            color = Color.Green,
            modifier = Modifier.background(Color.LightGray)
        )
    }
}