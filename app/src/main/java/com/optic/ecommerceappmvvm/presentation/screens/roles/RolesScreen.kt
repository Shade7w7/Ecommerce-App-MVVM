package com.optic.ecommerceappmvvm.presentation.screens.roles

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable

import androidx.navigation.NavHostController
import com.optic.ecommerceappmvvm.presentation.components.DefaultTopBar
import com.optic.ecommerceappmvvm.presentation.screens.roles.components.RolesContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.toSize
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Density


@Composable
fun RolesScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .clip(CircleShape)
                .background(Color.Green)
                .padding(horizontal = 10.dp , vertical = 8.dp)
        ) {
            Text(
                text = "SELECCIONA UN ROL",
                color = Color.Black,
                style = TextStyle(
                    fontWeight = FontWeight.Bold,
                    fontSize = 17.sp
                ),
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(18.dp)
            )
        }

        Spacer(modifier = Modifier.height(2.dp)) // Espacio entre el botón y los roles

        // Aquí se muestran los roles
        Scaffold(

        ) { paddingValues ->
            RolesContent(paddingValues, navController)
        }
    }
}