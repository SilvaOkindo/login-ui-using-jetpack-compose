package com.example.composeloginui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun LoginScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFEBFCFB))
            .padding(32.dp)
    ) {

        Image(
            painter = painterResource(id = R.drawable.logo_2),
            contentDescription = "Intro image",
            modifier = Modifier.padding(32.dp)
        )

        Column{
            Text(
                text = "Email",
                color = Color.Black,
                style = TextStyle(
                    fontWeight = FontWeight.Bold,
                    fontSize = 25.sp
                )
            )
            val inputValue = remember { mutableStateOf(TextFieldValue()) }
            TextField(
                value = inputValue.value,
                onValueChange = {inputValue.value = it},
                placeholder = {Text(text = "Enter your email")},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp),
                shape = RoundedCornerShape(10),
                colors = TextFieldDefaults.textFieldColors(backgroundColor = Color(0xFFC0F6F3))
            )

            Text(
                modifier = Modifier.padding(top = 16.dp),
                text = "Password",
                color = Color.Black,
                style = TextStyle(
                    fontWeight = FontWeight.Bold,
                    fontSize = 25.sp
                )
            )
            val inputValuePassword = remember { mutableStateOf(TextFieldValue()) }
            TextField(
                value = inputValuePassword.value,
                onValueChange = {inputValuePassword.value = it},
                placeholder = {Text(text = "Enter your password")},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp),
                shape = RoundedCornerShape(10),
                colors = TextFieldDefaults.textFieldColors(backgroundColor = Color(0xFFC0F6F3), focusedIndicatorColor = Color.Cyan)
            )
        }

        Text(
            text = "Don't remember your password? Recover",
            style = TextStyle(
                fontSize = 14.sp
            ),
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(32.dp)
        )
       Row (
           verticalAlignment = Alignment.CenterVertically,
               ) {
           Divider(
               color = Color.Magenta,
               thickness = 1.dp,
               startIndent = 8.dp,
               modifier = Modifier.width(100.dp)
           )
           Text(text = "Or Login With", Modifier.padding(horizontal = 16.dp), color = Color.Cyan)
           Divider(
               color = Color.Magenta,
               thickness = 1.dp,
               startIndent = 8.dp,
               modifier = Modifier.width(100.dp)
           )
       }

        Row {
            Card (
                modifier = Modifier.padding(top = 16.dp),
                shape = RoundedCornerShape(10.dp),
                backgroundColor = Color(0xFFEBFCFB),
                elevation = 10.dp
                    ) {
                Row(
                    modifier = Modifier.padding(8.dp),
                ) {
                    Image(painter = painterResource(id = R.drawable.facebook), contentDescription = "fb")
                    Text(text = "Facebook", fontWeight = FontWeight.Bold, fontSize = 20.sp, modifier = Modifier.padding(horizontal = 2.dp), color = Color.Cyan)
                }
            }
            Spacer(modifier = Modifier.width(65.dp))

            Card (
                modifier = Modifier.padding(top = 16.dp),
                shape = RoundedCornerShape(10.dp),
                backgroundColor = Color(0xFFEBFCFB),
                elevation = 10.dp
            ) {
                Row(
                    modifier = Modifier.padding(8.dp),
                ) {
                    Image(painter = painterResource(id = R.drawable.google), contentDescription = "fb")
                    Text(text = "Google", fontWeight = FontWeight.Bold, fontSize = 20.sp, modifier = Modifier.padding(horizontal = 2.dp), color = Color.Cyan)
                }
            }
        }

        Button(
            onClick = { /*TODO*/ },
            shape = RoundedCornerShape(10),
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 32.dp),
            colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF1DB7AE)),
        ) {
            Text(
                text = "Login",
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold,
                fontSize = 25.sp
            )
        }
    }
}