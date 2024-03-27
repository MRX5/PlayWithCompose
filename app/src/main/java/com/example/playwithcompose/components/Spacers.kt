package com.example.playwithcompose.components

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

// Vertical Spacer
@Composable
fun SpacerVertical32(){
    Spacer(modifier = Modifier.height(32.dp))
}

@Composable
fun SpacerVertical24(){
    Spacer(modifier = Modifier.height(24.dp))
}

@Composable
fun SpacerHorizontal16(){
    Spacer(modifier = Modifier.width(16.dp))
}
