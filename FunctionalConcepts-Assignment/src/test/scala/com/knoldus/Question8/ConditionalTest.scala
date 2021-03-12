//Functional Assignment by Durgesh Gupta
package com.knoldus.Question8

import org.scalatest.flatspec.AnyFlatSpec

class ConditionalTest extends  AnyFlatSpec{
  val conditionalTest = new ConditionalApi
  val input1:Int = 8
  val input2:Int = 3

  //Test case for valid inputs
  "Conditional Function" should "be valid" in {
    val actualResult = conditionalTest.conditional[String]("Durgesh", _.length > 4, _.reverse)
    val expectedResult = "hsegruD"
    assert(actualResult === expectedResult)
  }

  "Conditional" should "be valid if length of string is less than 4" in {
    val actualResult = conditionalTest.conditional[String]("Du", _.length > 4, _.reverse)
    val expectedResult = "Du"
    assert(actualResult === expectedResult)
  }

  //Test case for invalid
  "Conditional" should "be invalid" in {
    val actualResult = conditionalTest.conditional[String]("Dur", _.length > 4, _.reverse)
    val expectedResult = "Durgesh"
    assert(actualResult != expectedResult)
  }


}
