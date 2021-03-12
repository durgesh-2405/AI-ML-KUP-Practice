//Functional Assignment by Durgesh Gupta
package com.knoldus.Question6

import scala.io.StdIn.readInt

object MaximumHigherOrderImpl extends App {
  print("Enter the three numbers to compare: \n")
  val inputTuple_1 = readInt()
  val inputTuple_2 = readInt()
  val inputTuple_3 = readInt()
  val maximumHigherOrderImpl= new MaximumHigherOrderApi()
  print("Result is: " + maximumHigherOrderImpl.maxInHigherOrder((inputTuple_1,inputTuple_2,inputTuple_3), maximumHigherOrderImpl.maxOfTwo))

}
