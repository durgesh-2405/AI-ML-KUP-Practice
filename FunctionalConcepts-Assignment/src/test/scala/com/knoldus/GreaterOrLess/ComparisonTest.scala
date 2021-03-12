//Functional Assignment by Durgesh Gupta
package com.knoldus.GreaterOrLess

import org.scalatest.flatspec.AnyFlatSpec

class ComparisonTest extends AnyFlatSpec{
  val comparisonTest = new ComparisonApi()
  val input1:Int= 70
  val input2:Double= 76.66
  val input3:Double = 0.86
  val input4:Double= -7.0

  //Test case for Integer Type value
  "Comparison method " should "be valid for Integer Type" in {
    val actualResult = comparisonTest.comparison(input1)
    val expectedResult = "Greater"
    assert(actualResult === expectedResult)
  }

  //Test case for Double Type value
  "Comparison method" should "be valid for Double Type" in {
    val actualResult = comparisonTest.comparison(input2)
    val expectedResult = "Greater"
    assert(actualResult === expectedResult)
  }

  "Comparison method " should "be valid for the smaller value of Double Type" in {
    val actualResult = comparisonTest.comparison(input3)
    val expectedResult = "Greater"
    assert(actualResult === expectedResult)
  }

  //Test case for negative Type value
  "Comparison method" should "be valid if the value is of negative Type" in {
    val actualResult = comparisonTest.comparison(input4)
    val expectedResult = "Smaller"
    assert(actualResult === expectedResult)
  }

  //Test case if value = 0
  "Comparison method" should "be valid if the value is 0 " in {
    val actualResult = comparisonTest.comparison(0)
    val expectedResult = "Same"
    assert(actualResult === expectedResult)
  }



}
