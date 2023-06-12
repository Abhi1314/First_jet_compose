package com.defaultcompany.first_jet_compose

data class CalculatorState(
    val number1:String="",
    val number2:String="",
    val operation: CalculateOperation?=null
)
