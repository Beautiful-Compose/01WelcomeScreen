package com.example.myapplication.app1

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.R
import com.example.myapplication.ui.theme.MyApplicationTheme

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyApplicationTheme {
        App1Screen()
    }
}

@Composable
fun App1Screen() {
    Surface(color = Color.White, modifier = Modifier.fillMaxSize()) {
        Column {
            Logo()
            ImageSection(Modifier.weight(1f))
            ContentSection()
        }
    }
}


@Composable
fun Logo() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .background(Color.Transparent)
    ) {
        Row(
            modifier = Modifier
                .padding(horizontal = 30.dp, vertical = 30.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "logo",
                modifier = Modifier.size(50.dp)
            )
            Spacer(modifier = Modifier.width(15.dp))
            Text(text = "PRODUCTION", style = MaterialTheme.typography.h5)
        }
    }
}

@Composable
fun ImageSection(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 30.dp),
    ) {
        Box(modifier = Modifier.align(Alignment.Center)) {
            Image(
                painter = painterResource(id = R.drawable.person),
                contentDescription = "person",
                contentScale = ContentScale.Fit
            )
        }
    }
}

@Composable
fun ContentSection() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .clip(shape = RoundedCornerShape(topStart = 40.dp, topEnd = 40.dp))
            .background(Color(0xFF5061FF))
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(horizontal = 90.dp, vertical = 40.dp)
        ) {
            Text(
                text = "Welcome!",
                style = MaterialTheme.typography.h4,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(bottom = 7.dp),
                color = Color.White
            )
            Text(
                text = "Fast, beauty, productive and free apps for your devices every day",
                style = MaterialTheme.typography.body1,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(bottom = 35.dp),
                color = Color.LightGray
            )
            Button(
                onClick = {},
                colors = ButtonDefaults.textButtonColors(backgroundColor = Color(0xFF24272D)),
                modifier = Modifier.padding(bottom = 7.dp),
                contentPadding = PaddingValues(horizontal = 40.dp, vertical = 10.dp),
                shape = RoundedCornerShape(22.dp)
            ) {
                Text(
                    text = "Sign Up",
                    style = MaterialTheme.typography.h6,
                    color = Color.White
                )
            }
            Button(
                onClick = {},
                colors = ButtonDefaults.textButtonColors(backgroundColor = Color.Transparent),
                elevation = ButtonDefaults.elevation(defaultElevation = 0.dp),
                modifier = Modifier.padding(bottom = 30.dp),
            ) {
                Text(
                    text = "Sign In",
                    style = MaterialTheme.typography.h6,
                    color = Color.White
                )
            }
            Text(
                text = "Can't remember password?",
                style = MaterialTheme.typography.body1,
                color = Color.LightGray
            )
        }
    }
}