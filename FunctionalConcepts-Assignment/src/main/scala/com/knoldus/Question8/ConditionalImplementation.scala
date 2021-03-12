//Functional Assignment by Durgesh Gupta
package com.knoldus.Question8

import scala.io.StdIn.readLine

object ConditionalImplementation extends App {
  val conditionalImplementation = new ConditionalApi()
  print("Enter the input string: \n")
  val inputString = readLine()
  val output= conditionalImplementation.conditional[String](inputString, _.length > 4, _.reverse)
  print("Result will be: " + output)


}
