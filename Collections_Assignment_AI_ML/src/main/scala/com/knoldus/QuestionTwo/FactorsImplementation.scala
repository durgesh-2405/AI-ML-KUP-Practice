//Collections Assignment,Author - Durgesh Gupta

package com.knoldus.QuestionTwo

import scala.io.StdIn.readInt

object FactorsImplementation extends App {
  val factorsImplementation = new FactorsApi()
  print("Enter the value to calculate the factor: " + "\n")
  val inputValue = readInt
  print(s"Factors of $inputValue are : " + factorsImplementation.factors(inputValue))

}
