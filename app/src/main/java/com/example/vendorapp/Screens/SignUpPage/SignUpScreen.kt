package com.example.vendorapp.Screens.SignUpPage

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun SignUpScreen() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),

    ) {
        TextField(
            value = "", onValueChange = {},
            placeholder = {
                Text(text = "Your Name")
            },
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(top = 25.dp)

        )
        Spacer(modifier = Modifier.height(25.dp))

        TextField(
            value = "", onValueChange = {},
            placeholder = {
                Text(text = "Password")
            },
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
        Spacer(modifier = Modifier.height(25.dp))

        TextField(
            value = "", onValueChange = {},
            placeholder = {
                Text(text = "Your Phone Number")
            },
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
        Spacer(modifier = Modifier.height(25.dp))

        TextField(
            value = "", onValueChange = {},
            placeholder = {
                Text(text = "Your Email")
            },
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
        Spacer(modifier = Modifier.height(25.dp))

        TextField(
            value = "", onValueChange = {},
            placeholder = {
                Text(text = "Pincode")
            },
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
        Spacer(modifier = Modifier.height(25.dp))
        TextField(
            value = "", onValueChange = {},
            placeholder = {
                Text(text = "Address")
            },
            modifier = Modifier.align(Alignment.CenterHorizontally),
            minLines = 20

        )
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 50.dp)
        ) {
            Text(text = "Sign Up")

        }

    }
}