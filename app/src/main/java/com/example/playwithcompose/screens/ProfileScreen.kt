package com.example.playwithcompose.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ButtonElevation
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.playwithcompose.R
import com.example.playwithcompose.components.InputTextField
import com.example.playwithcompose.components.RoundedButton
import com.example.playwithcompose.components.SpacerHorizontal16
import com.example.playwithcompose.components.SpacerVertical24
import com.example.playwithcompose.components.SpacerVertical32
import com.example.playwithcompose.ui.theme.Green
import com.example.playwithcompose.ui.theme.Orange
import com.example.playwithcompose.ui.theme.PrimaryTextColor
import com.example.playwithcompose.ui.theme.Rubik
import com.example.playwithcompose.ui.theme.SecondaryTextColor

@Preview(showSystemUi = true)
@Composable
fun ProfileScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp, vertical = 24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Header("Account", "Edit and manage your account")
        SpacerVertical32()
        ProfileAvatar(resourceId = R.drawable.porsche)
        SpacerVertical24()
        TextButton(text = "Change profile picture") {}
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Box(modifier = Modifier.weight(1f)) {
                InputTextField(label = "First name", value = "Mostafa")
            }
            SpacerHorizontal16()
            Box(modifier = Modifier.weight(1f)) {
                InputTextField(label = "Last name", value = "Gad")
            }
        }
        InputTextField(label = "Location", value = "Egypt, Cairo, Ain Shams")
        InputTextField(label = "Email", value = "mostafagad@aait.com")
        InputTextField(label = "Phone", value = "+20123456789")
        Spacer(modifier = Modifier.weight(1f))
        RoundedButton(
            text = "Save"
        ) {
            
        }
    }
}

@Composable
private fun Header(title: String, subTitle: String) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.Start
    ) {
        Text(
            text = title,
            fontFamily = Rubik,
            fontWeight = FontWeight.Medium,
            fontSize = 20.sp,
            color = PrimaryTextColor
        )
        Text(
            text = subTitle,
            fontFamily = Rubik,
            fontWeight = FontWeight.Normal,
            fontSize = 14.sp,
            color = SecondaryTextColor
        )
    }
}

@Composable
private fun ProfileAvatar(resourceId: Int) {
    Image(
        painter = painterResource(id = resourceId),
        contentDescription = "Profile Avatar",
        modifier = Modifier
            .clip(RoundedCornerShape(16.dp))
            .size(150.dp)
            .scale(2f)
            .background(Orange)
    )
}

@Composable
private fun TextButton(text: String, onClick: () -> Unit) {
    Text(
        text = text,
        color = Orange,
        fontSize = 14.sp,
        fontWeight = FontWeight.Medium,
        fontFamily = Rubik,
        modifier = Modifier.clickable { onClick() }
    )
}