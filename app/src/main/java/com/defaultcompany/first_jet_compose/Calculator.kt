package com.defaultcompany.first_jet_compose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.DarkGray
import androidx.compose.ui.graphics.Color.Companion.LightGray
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.defaultcompany.first_jet_compose.ui.theme.Orange

@Composable
fun Calculator(
    state: CalculatorState,
    buttonspacing: Dp=8.dp,
    modifier:androidx.compose.ui.Modifier=Modifier,
    onAction:(CalculatorAction)->Unit
){
 Box(modifier = modifier
     .fillMaxSize()
     .background(Color.DarkGray)
     .padding(16.dp))
 {
     Column(modifier = modifier
         .fillMaxWidth()
         .align(Alignment.BottomCenter),
       verticalArrangement = Arrangement.spacedBy(buttonspacing))
     {
       Text(text = state.number1+(state.operation?.symbol ?:"")+state.number2
           , textAlign = TextAlign.End,modifier= Modifier
               .fillMaxWidth()
               .padding(32.dp),
               fontWeight = FontWeight.Light,
               fontSize = 80.sp,
               color = Color.White,
               maxLines = 2
       )
         Row(modifier = Modifier.fillMaxWidth(),
         horizontalArrangement = Arrangement.spacedBy(buttonspacing)) {
             CalculatorButton(symbol = "AC",
                 modifier = Modifier
                     .background(LightGray)
                     .aspectRatio(2f)
                     .weight(2f),
                 onClick = {
                     onAction(CalculatorAction.Clear)
                 }
             )
             CalculatorButton(symbol = "DEL",
                 modifier = Modifier
                     .background(LightGray)
                     .aspectRatio(1f)
                     .weight(1f),
                 onClick = {
                     onAction(CalculatorAction.Delete)
                 }
             )
             CalculatorButton(symbol = "/",
                 modifier = Modifier
                     .background(Orange)
                     .aspectRatio(1f)
                     .weight(1f),
                 onClick = {
                     onAction(CalculatorAction.Operation(CalculateOperation.Divide))
                 }
             )
         }
         Row(modifier = Modifier.fillMaxWidth(),
         horizontalArrangement = Arrangement.spacedBy(buttonspacing)) {


             CalculatorButton(symbol = "7",
                 modifier = Modifier
                     .background(DarkGray)
                     .aspectRatio(1f)
                     .weight(1f),
                 onClick = {
                   onAction(CalculatorAction.Number(7))
                 }
             )
             CalculatorButton(symbol = "8",
                 modifier = Modifier
                     .background(DarkGray)
                     .aspectRatio(1f)
                     .weight(1f),
                 onClick = {
                     onAction(CalculatorAction.Number(8))
                 }
             )
             CalculatorButton(symbol = "9",
                 modifier = Modifier
                     .background(DarkGray)
                     .aspectRatio(1f)
                     .weight(1f),
                 onClick = {
                     onAction(CalculatorAction.Number(9))
                 }
             )
             CalculatorButton(symbol = "x",
                 modifier = Modifier
                     .background(Orange)
                     .aspectRatio(1f)
                     .weight(1f),
                 onClick = {
                     onAction(CalculatorAction.Operation(CalculateOperation.Multiply))
                 }
             )
         }
         Row(modifier = Modifier.fillMaxWidth(),
             horizontalArrangement = Arrangement.spacedBy(buttonspacing)) {
             CalculatorButton(symbol = "4",
                 modifier = Modifier
                     .background(DarkGray)
                     .aspectRatio(1f)
                     .weight(1f),
                 onClick = {
                     onAction(CalculatorAction.Number(4))
                 }
             )
             CalculatorButton(symbol = "5",
                 modifier = Modifier
                     .background(DarkGray)
                     .aspectRatio(1f)
                     .weight(1f),
                 onClick = {
                     onAction(CalculatorAction.Number(5))
                 }
             )
             CalculatorButton(symbol = "6",
                 modifier = Modifier
                     .background(DarkGray)
                     .aspectRatio(1f)
                     .weight(1f),
                 onClick = {
                     onAction(CalculatorAction.Number(6))
                 }
             )
             CalculatorButton(symbol = "-",
                 modifier = Modifier
                     .background(Orange)
                     .aspectRatio(1f)
                     .weight(1f),
                 onClick = {
                     onAction(CalculatorAction.Operation(CalculateOperation.Substract))
                 }
             )
         }
         Row(modifier = Modifier.fillMaxWidth(),
             horizontalArrangement = Arrangement.spacedBy(buttonspacing)) {
             CalculatorButton(symbol = "1",
                 modifier = Modifier
                     .background(DarkGray)
                     .aspectRatio(1f)
                     .weight(1f),
                 onClick = {
                     onAction(CalculatorAction.Number(1))
                 }
             )
             CalculatorButton(symbol = "2",
                 modifier = Modifier
                     .background(DarkGray)
                     .aspectRatio(1f)
                     .weight(1f),
                 onClick = {
                     onAction(CalculatorAction.Number(2))
                 }
             )
             CalculatorButton(symbol = "3",
                 modifier = Modifier
                     .background(DarkGray)
                     .aspectRatio(1f)
                     .weight(1f),
                 onClick = {
                     onAction(CalculatorAction.Number(3))
                 }
             )
             CalculatorButton(symbol = "+",
                 modifier = Modifier
                     .background(Orange)
                     .aspectRatio(1f)
                     .weight(1f),
                 onClick = {
                     onAction(CalculatorAction.Operation(CalculateOperation.Add))
                 }
             )
         }
         Row(modifier = Modifier.fillMaxWidth(),
             horizontalArrangement = Arrangement.spacedBy(buttonspacing)) {
             CalculatorButton(symbol = "0",
                 modifier = Modifier
                     .background(DarkGray)
                     .aspectRatio(1f)
                     .weight(1f),
                 onClick = {
                     onAction(CalculatorAction.Number(0))
                 }
             )
             CalculatorButton(symbol = ".",
                 modifier = Modifier
                     .background(DarkGray)
                     .aspectRatio(1f)
                     .weight(1f),
                 onClick = {
                     onAction(CalculatorAction.Decimal)
                 }
             )
             CalculatorButton(symbol = "=",
                 modifier = Modifier
                     .background(DarkGray)
                     .aspectRatio(1f)
                     .weight(1f),
                 onClick = {
                     onAction(CalculatorAction.Calculate)
                 }
             )
             CalculatorButton(symbol = "*",
                 modifier = Modifier
                     .background(Orange)
                     .aspectRatio(1f)
                     .weight(1f),
                 onClick = {
                     onAction(CalculatorAction.Operation(CalculateOperation.Multiply))
                 }
             )
         }


     }
 }
}