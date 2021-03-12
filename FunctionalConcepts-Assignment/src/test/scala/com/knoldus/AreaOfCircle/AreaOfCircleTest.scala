//Functional Assignment by Durgesh Gupta
package com.knoldus.AreaOfCircle

import org.scalatest.flatspec.AnyFlatSpec

class AreaOfCircleTest extends AnyFlatSpec{
  val areaOfCircleTest = new AreaOfCircleApi()
  //Test case for integer type radius
  "Area of Circle method " should "be valid for integer radius" in {
    val actualResult = areaOfCircleTest.areaOfCircle("23")
    val expectedResult = 1661.9025137490005
    assert(actualResult === expectedResult)
  }


  //Test case for Zero radius
  "Area of Circle method " should "be valid if radius 0" in {
    val actualResult = areaOfCircleTest.areaOfCircle("0")
    val expectedResult = 0
    assert(actualResult === expectedResult)
  }

  //Test case for invalid output
  "Area of Circle method" should "be invalid" in {
    val actualResult = areaOfCircleTest.areaOfCircle("90")
    val expectedResult = 67
    assert(actualResult != expectedResult)
  }


}
