//Functional Assignment by Durgesh Gupta
package com.knoldus.Question7

import org.scalatest.flatspec.AnyFlatSpec

class MultiplicationInHigherOrderTest extends AnyFlatSpec{
  val multiplicationInHigherOrderTest = new MultiplicationInHigherOrderApi()
  val input1:Int = 3
  val input2:Int = 10

  //Test case for valid inputs
  "Multiplication Higher Order method " should "be valid" in {
    val intermediateResult = multiplicationInHigherOrderTest.multiply(input1)
    val actualResult = intermediateResult(input2)
    val expectedResult = 30
    assert(actualResult === expectedResult)
  }

  //Test case for invalid inputs
  "Multiplication Higher Order Method" should "be invalid" in {
    val intermediateResult = multiplicationInHigherOrderTest.multiply(input1)
    val actualResult = intermediateResult(input2)
    val expectedResult = 60
    assert(actualResult != expectedResult)
  }


}
