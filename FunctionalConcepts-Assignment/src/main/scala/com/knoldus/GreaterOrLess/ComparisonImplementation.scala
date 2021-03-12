//Functional Assignment by Durgesh Gupta
package com.knoldus.GreaterOrLess

import scala.io.StdIn.readDouble

object ComparisonImplementation extends App {
  print("Enter the number you want to compare: \n")
  val inputNumber = readDouble()
  val comparisonImplementation = new ComparisonApi()
  print("The number is: " + comparisonImplementation.comparison(inputNumber))

}
