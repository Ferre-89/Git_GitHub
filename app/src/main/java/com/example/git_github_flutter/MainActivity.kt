package com.example.git_github_flutter

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
import com.example.git_github_flutter.ui.theme.Git_github_flutterTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Git_github_flutterTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Agrego segundo Greeting")

                    Greeting("Comenzando con lo bueno de GitHub, vamo y vamo")

                     Greeting("Siguiendo con el curso")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Git_github_flutterTheme {
        Greeting("Android gustando el curso")
        Greeting("Android gustando el curso 2")
        Greeting("Android gustando el curso 3")
        Greeting("Android gustando el curso 44444444444")




        Greeting("Android gustando dsadsadasd curso 6")
        Greeting("Android gustando dsadsadasd cursodasdsadasas")
        Greeting("Android gustando dsadsadasd dasdasdasdasas")
        Greeting("Android gustando dsadsadasd dasdasdasdasas test")
        Greeting("Android gustando dsadsadasd dasdasdasdasas test 2")

        Greeting("Android gustando dsadsadasd dasdasdasdasas test 3")


    }
}
