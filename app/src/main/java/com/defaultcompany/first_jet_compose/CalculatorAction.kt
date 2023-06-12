package com.defaultcompany.first_jet_compose

sealed class CalculatorAction{
    data class Number(val number:Int):CalculatorAction()
    object Clear:CalculatorAction()
    object Delete:CalculatorAction()
    data class Operation(val operation: CalculateOperation): CalculatorAction()
    object Calculate: CalculatorAction()
    object Decimal: CalculatorAction()
}
