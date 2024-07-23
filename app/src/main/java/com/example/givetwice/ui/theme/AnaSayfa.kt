package com.example.givetwice.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add 
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.givetwice.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AnaSayfa(navController: NavController) {
    var presses by remember { mutableIntStateOf(0) }

    Scaffold(

        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
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
                    color = Color.Black,
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
                            .clickable(onClick = {
                                navController.navigate("LoginScreen")
                            })
                    )
                }
            }
        },

        floatingActionButton = {
            FloatingActionButton(onClick = { presses++ }) {
                Icon(Icons.Default.Add, contentDescription = "Add")
            }
        }


    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding),
            verticalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            // Foods
            Column {
                Text(
                    modifier = Modifier
                        .padding(top = 50.dp)
                        .padding(start = 165.dp),
                    text = "Foods",
                    fontSize = 24.sp,
                    letterSpacing = 0.sp,
                    color = Color.Black,
                    fontFamily = FontFamily.Monospace,
                    fontWeight = FontWeight.Bold,
                    textDecoration = TextDecoration.Underline
                )

                Row(modifier = Modifier.padding(top = 15.dp)) {
                    Image(
                        painter = painterResource(R.drawable.food),
                        contentDescription = "food",
                        modifier = Modifier
                            .width(180.dp)
                            .padding(start = 20.dp)
                            .clickable(onClick = {
                                navController.navigate("ikinci_sayfa")
                            })
                    )

                    Image(
                        painter = painterResource(R.drawable.food2),
                        contentDescription = "food",
                        modifier = Modifier
                            .width(180.dp)
                            .padding(start = 40.dp)
                    )
                }
            }

            // Clothes
            Column {
                Text(
                    text = "Clothes",
                    modifier = Modifier
                        .padding(top = 50.dp)
                        .padding(start = 155.dp),
                    fontSize = 24.sp,
                    letterSpacing = 0.sp,
                    color = Color.Black,
                    fontFamily = FontFamily.Monospace,
                    fontWeight = FontWeight.Bold,
                    textDecoration = TextDecoration.Underline
                )

                Row(modifier = Modifier.padding(top = 20.dp)) {
                    Image(
                        painter = painterResource(R.drawable.clothes),
                        contentDescription = "clothes",
                        modifier = Modifier
                            .width(200.dp)
                            .padding(start = 20.dp)
                    )

                    Image(
                        painter = painterResource(R.drawable.clothes2),
                        contentDescription = "clothes",
                        modifier = Modifier
                            .width(220.dp)
                            .padding(start = 20.dp)
                    )
                }
            }
        }
    }
}
