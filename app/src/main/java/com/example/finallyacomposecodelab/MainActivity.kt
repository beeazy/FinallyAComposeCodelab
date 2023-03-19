package com.example.finallyacomposecodelab

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.convolib.Conversation
import com.example.finallyacomposecodelab.ui.theme.FinallyAComposeCodelabTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FinallyAComposeCodelabTheme() {
                Surface(modifier = Modifier.fillMaxSize()) {
                    Conversation(messages = com.example.convolib.SampleData.conversationSample)
                }
            }
        }
    }
}

@Preview
@Composable
fun PreviewThis() {

    FinallyAComposeCodelabTheme() {
        Surface() {
            Conversation(messages = com.example.convolib.SampleData.conversationSample)
        }
    }
}
