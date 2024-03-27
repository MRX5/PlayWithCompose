package com.example.playwithcompose.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.playwithcompose.ui.theme.CardBackgroundColor
import com.example.playwithcompose.ui.theme.PrimaryTextColor
import com.example.playwithcompose.ui.theme.Rubik
import com.example.playwithcompose.ui.theme.SecondaryTextColor

@Composable
fun InputTextField(
    label: String,
    value: String,
){
    Card(
        modifier = Modifier.fillMaxWidth().padding(bottom = 16.dp),
        colors = CardDefaults.cardColors(containerColor = CardBackgroundColor),
        shape = RoundedCornerShape(16.dp)
    ) {
        Column(
            modifier = Modifier.padding(horizontal = 24.dp, vertical = 12.dp)) {
            Text(
                text = label,
                color = SecondaryTextColor,
                fontWeight = FontWeight.Normal,
                fontFamily = Rubik,
                fontSize = 10.sp
            )
            Text(
                text = value,
                color = PrimaryTextColor,
                fontWeight = FontWeight.Normal,
                fontFamily = Rubik,
                fontSize = 14.sp
            )
        }
    }
}