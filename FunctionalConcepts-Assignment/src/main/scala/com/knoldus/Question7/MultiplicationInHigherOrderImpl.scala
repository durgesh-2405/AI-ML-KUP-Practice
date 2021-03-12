//Functional Assignment by Durgesh Gupta
package com.knoldus.Question7

import scala.io.StdIn.readInt

object MultiplicationInHigherOrderImpl extends App{
  print("Enter the two values: \n")
  val input_1 = readInt()
  val input_2 = readInt()
  val multiplicationInHigherOrderImpl = new MultiplicationInHigherOrderApi()

  val multiplier = multiplicationInHigherOrderImpl.multiply(input_1)
  print("The output will be: " + multiplier(input_2) )


}
