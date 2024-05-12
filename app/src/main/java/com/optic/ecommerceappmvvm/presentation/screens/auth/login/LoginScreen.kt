package com.optic.ecommerceappmvvm.presentation.screens.auth.login

import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.optic.ecommerceappmvvm.presentation.screens.auth.login.components.Login
import com.optic.ecommerceappmvvm.presentation.screens.auth.login.components.LoginContent
import com.optic.ecommerceappmvvm.presentation.ui.theme.EcommerceAppMVVMTheme

@Composable
fun LoginScreen(navController: NavHostController) {
    
    Scaffold(
    ) { paddingValues ->
        LoginContent(navController = navController, paddingValues)
    }
    Login(navController = navController)
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LoginScreenPreview() {
    EcommerceAppMVVMTheme {
        LoginScreen(rememberNavController())
    }
}