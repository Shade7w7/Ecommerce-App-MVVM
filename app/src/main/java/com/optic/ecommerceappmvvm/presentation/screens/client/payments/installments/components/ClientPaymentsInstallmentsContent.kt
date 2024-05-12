package com.optic.ecommerceappmvvm.presentation.screens.client.payments.installments.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.optic.ecommerceappmvvm.domain.model.PayerCost
import com.optic.ecommerceappmvvm.presentation.components.DefaultButton
import com.optic.ecommerceappmvvm.presentation.screens.client.payments.installments.ClientPaymentsInstallmentsViewModel

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun ClientPaymentsInstallmentsContent(paddingValues: PaddingValues, installments: List<PayerCost>, vm: ClientPaymentsInstallmentsViewModel = hiltViewModel()) {


    var expanded by remember { mutableStateOf(false) }

    Column(modifier = Modifier
        .padding(paddingValues)
        .padding(20.dp)) {
        ExposedDropdownMenuBox(
            expanded = expanded,
            onExpandedChange = {
                expanded = !expanded
            }
        ) {
            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                value = vm.selectedInstallment?.recommendedMessage ?: "",
                onValueChange = {},
                readOnly = true,
                label = { Text(text = "Tipo de identificacion") },
                trailingIcon = {
                    ExposedDropdownMenuDefaults.TrailingIcon(expanded = expanded)
                },
                colors = TextFieldDefaults.textFieldColors(
                    backgroundColor = Color.White
                )
            )

            ExposedDropdownMenu(
                modifier = Modifier.background(Color.White),
                expanded = expanded,
                onDismissRequest = { expanded = false }
            ) {
                installments.forEachIndexed { index, installment ->
                    DropdownMenuItem(
                        onClick = {
                            vm.selectedInstallment = installment
                            expanded = false
                        }
                    ) {
                        Text(text = installment.recommendedMessage)
                    }
                }
            }
        }

    }

}