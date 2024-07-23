package com.example.givetwice.ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf 
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController


@OptIn(ExperimentalMaterial3Api::class)
@Composable

fun LoginScreen(navController: NavController) {

    var name by remember {
        mutableStateOf("")
    }

    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(12.dp)) {


        OutlinedTextField(  value = name, //yazilan metni bu degiskene atar
            onValueChange = {if (it.length<=15)name=it}, //max kac karekterli metin alabilecegini belirtir
            supportingText = {
                Text(text = "${name.length}/15 ",   //girisin sag altina ekler gorevi kac karakterli yazi girdigimizi gosterir
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.End)
            },
            label = { Text(text = "Enter name") }, // bu kutucukda isim verir
            singleLine = true, // ekranda sadece bir satir gosterir
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            leadingIcon = {
                Icon(Icons.Filled.Person , contentDescription = "")
            }
        )


        var password by remember {
            mutableStateOf("")
        }

        OutlinedTextField(  value = password, //yazilan metni bu degiskene atar
            onValueChange = {if (it.length<=15)password=it}, //max kac karekterli metin alabilecegini belirtir
            visualTransformation = PasswordVisualTransformation(),
            supportingText = {
                Text(text = "${password.length}/15 ",   //girisin sag altina ekler gorevi kac karakterli yazi girdigimizi gosterir
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.End)
            },
            label = { Text(text = "Enter password") }, // bu kutucukda isim verir
            singleLine = true, // ekranda sadece bir satir gosterir
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            leadingIcon = {
                Icon(Icons.Filled.Person , contentDescription = "")
            }
        )


        Button(
            onClick = { navController.navigate("AnaSayfa") },
            modifier = Modifier
                .padding(8.dp) // Buton etrafında boşluk ekler
                .fillMaxWidth() // Butonu yatay olarak tam genişlikte doldurur

        ) {
            Text(text = "Giris Yap")
        }
    }




}