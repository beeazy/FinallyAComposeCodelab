package com.example.convolib

object SampleData {
    val title = "Evans"

    // Sample conversation data
    val conversationSample = listOf(
        Message(
            title,
            "Test...Test...Test..."
        ),
        Message(
            title,
            "List of Android versions:\n" +
                    "Android KitKat (API 19)\n" +
                    "Android Lollipop (API 21)\n" +
                    "Android Marshmallow (API 23)\n" +
                    "Android Nougat (API 24)\n" +
                    "Android Oreo (API 26)\n" +
                    "Android Pie (API 28)\n" +
                    "Android 10 (API 29)\n" +
                    "Android 11 (API 30)\n" +
                    "Android 12 (API 31)\n"
        ),
        Message(
            title,
            "I think Kotlin is my favorite programming language.\n" +
                    "It's so much fun!"
        ),
        Message(
            title,
            "Searching for alternatives to XML layouts..."
        ),
        Message(
            title,
            "Hey, take a look at Jetpack Compose, it's great!\n" +
                    "It's the Android's modern toolkit for building native UI." +
                    "It simplifies and accelerates UI development on Android." +
                    "Less code, powerful tools, and intuitive Kotlin APIs :)"
        ),
        Message(
            title,
            "It's available from API 21+ :)"
        ),
        Message(
            title,
            "Writing Kotlin for UI seems so natural, Compose where have you been all my life?"
        ),
        Message(
            title,
            "Android Studio next version's name is Arctic Fox"
        ),
        Message(
            title,
            "Android Studio Arctic Fox tooling for Compose is top notch ^_^"
        ),
        Message(
            title,
            "I didn't know you can now run the emulator directly from Android Studio"
        ),
        Message(
            title,
            "Compose Previews are great to check quickly how a composable layout looks like"
        ),
        Message(
            title,
            "Previews are also interactive after enabling the experimental setting"
        ),
        Message(
            title,
            "Have you tried writing build.gradle with KTS?"
        ),
    )
}
