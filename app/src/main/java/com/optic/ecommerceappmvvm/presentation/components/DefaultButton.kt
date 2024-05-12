package com.optic.ecommerceappmvvm.presentation.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.optic.ecommerceappmvvm.presentation.ui.theme.Green500

@Composable
fun DefaultButton(
    modifier: Modifier,
    text: String,
    onClick: () -> Unit,
    color: Color = Green500,
    icon: ImageVector = Icons.Default.ArrowForward
) {
    Button(
        modifier = modifier.height(50.dp),
        shape = RoundedCornerShape(40.dp),
        onClick = { onClick() },
        colors = ButtonDefaults.buttonColors(backgroundColor = color)
    ) {
        Text(
            text = text,
            fontSize = 17.sp,
            color = Color.Black,
            fontWeight = FontWeight.Bold
        )
    }
}
