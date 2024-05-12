package com.optic.ecommerceappmvvm.presentation.screens.auth.register

import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.optic.ecommerceappmvvm.presentation.components.DefaultTopBar
import com.optic.ecommerceappmvvm.presentation.screens.auth.register.components.Register
import com.optic.ecommerceappmvvm.presentation.screens.auth.register.components.RegisterContent
import com.optic.ecommerceappmvvm.presentation.ui.theme.EcommerceAppMVVMTheme

@Composable
fun RegisterScreen(navController: NavHostController) {

    Scaffold(
        topBar = {
            DefaultTopBar(
                title = "Registro",
                upAvailable = true,
                navController = navController
            )

        },

    ) { paddingValues ->
        RegisterContent(paddingValues = paddingValues)
    }
    Register(navController)
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun RegisterScreenPreview() {
    EcommerceAppMVVMTheme {
        RegisterScreen(rememberNavController())
    }
}