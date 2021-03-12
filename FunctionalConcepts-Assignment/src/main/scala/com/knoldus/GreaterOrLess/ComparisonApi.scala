//Functional Assignment by Durgesh Gupta
package com.knoldus.GreaterOrLess

class ComparisonApi {
  def comparison(inputNumber: Double): String= {
    inputNumber match{
      case inputNumber if inputNumber == 0 => "Same"
      case inputNumber if inputNumber < 0  => "Smaller"
      case inputNumber if inputNumber > 0 => "Greater"
    }
  }

}
