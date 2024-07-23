package com.example.givetwice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme 
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.givetwice.ui.theme.GiveTwiceTheme


class MainActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GiveTwiceTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {

                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)

@Composable
fun ScaffoldExample2() {

    Scaffold(

        topBar = {
            TopAppBar(
                colors = topAppBarColors(
                    containerColor = Color.Transparent,
                    titleContentColor = Color.Black,

                ),
                title = {
                    Image(
                        painter = painterResource(R.drawable.logoend),
                        contentDescription = "logo",
                        modifier = Modifier
                            .padding(start = 60.dp)
                            .padding(top = 15.dp)
                            .padding(bottom = 20.dp)
                            .width(250.dp)
                            .height(250.dp)
                    )
                }
            )
        },

        bottomBar = {
            BottomAppBar(
                containerColor = Color.Transparent,
                contentColor = MaterialTheme.colorScheme.primary,
                modifier = Modifier.border(
                    width = 0.dp,
                    color = Color.Black
                )
            ) {

                Row() {
                    Image(
                        painter = painterResource(R.drawable.home2),
                        contentDescription = "home",
                        modifier = Modifier
                            .width(150.dp)
                            .padding(11.dp)
                    )
                    Image(
                        painter = painterResource(R.drawable.save),
                        contentDescription = "save",
                        modifier = Modifier
                            .width(100.dp)
                            .padding(11.dp)
                    )
                    Image(
                        painter = painterResource(R.drawable.exit),
                        contentDescription = "exit",
                        modifier = Modifier
                            .width(150.dp)
                            .padding(10.dp)
                    )
                }
            }
        },
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding),
            verticalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            // Foods
            Column {
                Image(
                    painter = painterResource(R.drawable.food),
                    contentDescription = "food",
                    modifier = Modifier
                        .width(370.dp)
                        .height(370.dp)
                        .padding(top = 50.dp)
                        .clickable(onClick = {
                        })
                )
                Row(modifier = Modifier.padding(all = 30.dp)) {
                    Column{
                        Text(
                            text = "Product Name:",
                            fontSize = 18.sp,
                            fontWeight = FontWeight.SemiBold,
                            fontFamily = FontFamily.Default,
                            modifier = Modifier
                                .padding(top = 20.dp)
                                .padding(start = 20.dp)
                        )
                        Text(
                            text = "Shop Name:",
                            fontSize = 18.sp,
                            fontWeight = FontWeight.SemiBold,
                            fontFamily = FontFamily.Default,
                            modifier = Modifier
                                .padding(top = 20.dp)
                                .padding(start = 20.dp)
                        )
                        Text(
                            text = "Shop Location:",
                            fontSize = 18.sp,
                            fontWeight = FontWeight.SemiBold,
                            fontFamily = FontFamily.Default,
                            modifier = Modifier
                                .padding(top = 20.dp)
                                .padding(start = 20.dp)
                        )
                    }
                    Column{
                        Text(
                            text = "Chicken with Salad",
                            fontSize = 18.sp,
                            modifier = Modifier
                                .padding(start = 10.dp)
                                .padding(top = 20.dp)
                        )
                        Text(
                            text = "Pilavistan",
                            fontSize = 18.sp,
                            modifier = Modifier
                                .padding(start = 10.dp)
                                .padding(top = 20.dp)
                        )
                        Text(
                            text = "https://maps.app.goo.gl/woAfpqq1ZhPejKiz8",
                            fontSize = 18.sp,
                            modifier = Modifier
                                .padding(start = 10.dp)
                                .padding(top = 20.dp)
                        )
                    }
                }
            }
        }
    }
}
