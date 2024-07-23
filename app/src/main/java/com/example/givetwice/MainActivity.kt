package com.example.givetwice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.givetwice.ui.theme.AnaSayfa
import com.example.givetwice.ui.theme.GiveTwiceTheme
import com.example.givetwice.ui.theme.IkinciSayfa
import com.example.givetwice.ui.theme.LoginScreen


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) { 
        super.onCreate(savedInstanceState)
        setContent {
            GiveTwiceTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    //ScaffoldExample() // ana sayfa
                    SayfaGecisleri()
                }
            }
        }
    }
}


@Composable
fun SayfaGecisleri(){
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "LoginScreen"){
        composable(route="ikinci_sayfa"){//diger sayfaya bu skeilde veri gonderebiliriz ?name degiskeni tarif eder ondan sonraki degiskneler icin baslarina & bunu koymak yeterlidir
            IkinciSayfa(navController)
        }
        composable(route="AnaSayfa"){
            AnaSayfa(navController)
        }
        composable(route="LoginScreen"){
            LoginScreen(navController)
        }


    }
}















