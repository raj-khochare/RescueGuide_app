package com.example.rescuebuddy.ui.screens



import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import com.example.rescuebuddy.R
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.systemBarsPadding


@Composable
fun RescueGuideApp() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .systemBarsPadding() // handles status & nav bars
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFF8F9FA))
                .padding(vertical = 24.dp)
                .navigationBarsPadding(),

            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Box(
                modifier = Modifier
                    .size(350.dp)
                    .clip(RoundedCornerShape(20.dp))
                    .align(Alignment.CenterHorizontally)

            ) {
                Image(
                    painter = painterResource(R.drawable.app_logo),
                    contentDescription = "introScreen image",
                    modifier = Modifier.fillMaxSize(),
                )
            }
            Text(
                text = "Get help in an emergency ",
                color = Color.Black,
                fontSize = 40.sp,
                lineHeight = 40.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth(),

                fontFamily = FontFamily.SansSerif
            )
//            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = "In an emergency, You can quickly send an alert to your emergency contact and nearby helpers.",
                fontSize = 20.sp,
                color = Color.Black,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.W400,
                fontFamily = FontFamily.SansSerif,
                modifier = Modifier
                    .padding(horizontal = 20.dp)
                    .fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(20.dp))
            Button(
                onClick = { },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .padding(horizontal = 16.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFE1002D),
                    contentColor = Color.White
                ),
                shape = RoundedCornerShape(40)
            ) {
                Text(text = "Get Started")
            }
        }

    }
}

@Preview(showBackground = true)
@Composable
fun introScreenPreview() {
    RescueGuideApp()
}

