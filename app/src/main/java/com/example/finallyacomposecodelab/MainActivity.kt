package com.example.finallyacomposecodelab

import android.os.Bundle
import android.widget.Toolbar
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.finallyacomposecodelab.ui.theme.FinallyAComposeCodelabTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FinallyAComposeCodelabTheme() {
                Surface(modifier = Modifier.fillMaxSize()) {
                    Greet(txt = text("Evans", "am learning compose by myself"))
                }
            }
        }
    }
}
data class text(val title: String, val body: String)

@Composable
fun Greet(txt: text) {

    Row(modifier = Modifier.padding(all = 8.dp)) {
        Image(
            painter = painterResource(id = R.mipmap.ali),
            contentDescription = "No description",
            modifier = Modifier
                .size(60.dp)
                .clip(CircleShape)
                .clipToBounds()
                .border(1.5.dp, MaterialTheme.colorScheme.secondary, CircleShape)
                .background(color = Color.DarkGray)
        )

        Spacer(modifier = Modifier.width(8.dp))
        Column() {
            Text(text = "I am ${txt.title}", color = MaterialTheme.colorScheme.primary, style = MaterialTheme.typography.titleMedium)

            Spacer(modifier = Modifier.height(4.dp))

            Surface(shape = MaterialTheme.shapes.medium, shadowElevation = 1.dp) {
                Text(text = txt.body, style = MaterialTheme.typography.bodyMedium)

            }
        }
    }
}


@Preview
@Composable
fun PreviewThis() {

    FinallyAComposeCodelabTheme() {
        Surface() {
            Greet(txt = text("Evans", "am learning compose by myself"))
        }
    }
}
