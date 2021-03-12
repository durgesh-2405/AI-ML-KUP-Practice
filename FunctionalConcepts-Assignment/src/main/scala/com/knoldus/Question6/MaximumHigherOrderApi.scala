//Functional Assignment by Durgesh Gupta
package com.knoldus.Question6

class MaximumHigherOrderApi {
  val maxOfTwo: (Int, Int) => Int = (firstNumber: Int, secondNumber: Int) => if(firstNumber> secondNumber) firstNumber else secondNumber

  def maxInHigherOrder(inputTuple:(Int, Int, Int), maxOfTwo: (Int, Int) => Int): Int = {
    maxOfTwo(inputTuple._1, maxOfTwo(inputTuple._2,inputTuple._3))
  }

}
