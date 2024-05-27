package com.optic.ecommerceappmvvm.presentation.screens.client.product.detail.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.rememberPagerState
import com.optic.ecommerceappmvvm.presentation.components.DotsIndicator
import com.optic.ecommerceappmvvm.presentation.components.SliderView
import com.optic.ecommerceappmvvm.presentation.screens.client.product.detail.ClientProductDetailViewModel
import com.optic.ecommerceappmvvm.presentation.ui.theme.Gray100
import kotlinx.coroutines.delay

@OptIn(ExperimentalPagerApi::class)
@Composable
fun ClientProductDetailContent(paddingValues: PaddingValues, vm: ClientProductDetailViewModel = hiltViewModel()) {
    val state = rememberPagerState()
    Box(
        modifier = Modifier.padding(paddingValues).fillMaxSize()
    ) {
        Column(
        ) {
            SliderView(state = state, images = vm.productImages)
            Spacer(modifier = Modifier.height(4.dp))
            DotsIndicator(totalDots = vm.productImages.size, selectedIndex = state.currentPage)
        }

        Card(
            modifier = Modifier.padding(top = 310.dp),
            shape = RoundedCornerShape(
                topEnd = 40.dp,
                topStart = 40.dp,
            ),
            backgroundColor = Color.White
        ) {
            Column(
                modifier = Modifier.padding(20.dp)
            ) {
                Text(
                    modifier = Modifier.padding(vertical = 7.dp),
                    text = vm.product.name,
                    fontWeight = FontWeight.Bold,
                    fontSize = 19.sp
                )
                Divider(
                    modifier = Modifier.padding(vertical = 10.dp),
                    color = Gray100
                )
                Text(
                    modifier = Modifier.padding(bottom = 7.dp),
                    text = "Descripcion",
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp
                )
                Text(
                    text = vm.product.description,
                    fontSize = 15.sp
                )
                Divider(
                    modifier = Modifier.padding(vertical = 10.dp),
                    color = Gray100
                )
                Text(
                    modifier = Modifier.padding(bottom = 7.dp),
                    text = "Precio",
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp
                )
                Text(
                    text = vm.product.price.toString(),
                    fontSize = 15.sp
                )
                Divider(
                    modifier = Modifier.padding(vertical = 10.dp),
                    color = Gray100
                )

                Spacer(modifier = Modifier.weight(1f))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    verticalAlignment = Alignment.CenterVertically
                ) {

                }

            }
        }
    }

    LaunchedEffect(key1 = state.currentPage) {
        delay(10000)
        var newPosition = state.currentPage + 1
        if (newPosition > vm.productImages.size - 1) {
            newPosition = 0
        }
        state.animateScrollToPage(newPosition)
    }
}