package com.defaultcompany.first_jet_compose

sealed class CalculateOperation(val symbol:String){
    object Add:CalculateOperation("+")
    object Multiply:CalculateOperation("*")
    object Substract:CalculateOperation("-")
    object Divide:CalculateOperation("/")
}
