//Functional Assignment by Durgesh Gupta
package com.knoldus.DuplicateElements

import org.scalatest.flatspec.AnyFlatSpec

class DuplicateElementsTest extends  AnyFlatSpec{

  val duplicateElementsTest = new DuplicateElementsApi()
  //Test case for Character Type List
  "Duplicate method " should "be valid for elements of Character Type" in {
    val actualResult = duplicateElementsTest.duplicationOfElement(List('a','b','c'))
    val expectedResult = List('a','a','b','b','c','c')
    assert(actualResult === expectedResult)
  }

  //Test case for String Type List
  "Duplicate method " should "be valid for elements of String Type" in {
    val actualResult = duplicateElementsTest.duplicationOfElement(List("durgesh","gupta"))
    val expectedResult = List("durgesh","durgesh","gupta","gupta")
    assert(actualResult === expectedResult)
  }

  //Test case for Integer Type List
  "Duplicate method" should "be valid for elements of Integer Type" in {
    val actualResult = duplicateElementsTest.duplicationOfElement(List(1,2,3))
    val expectedResult = List(1,1,2,2,3,3)
    assert(actualResult === expectedResult)
  }


  //Test case for Any Type List
  "Duplicate method " should "be valid for elements of Any Type" in {
    val actualResult = duplicateElementsTest.duplicationOfElement(List(1.1,"some",2,'a','!'))
    val expectedResult = List(1.1,1.1,"some","some",2,2,'a','a','!','!')
    assert(actualResult === expectedResult)
  }

  //Test case for Empty List
  "Duplicate method " should "be valid if the List is empty" in {
    val actualResult = duplicateElementsTest.duplicationOfElement(List())
    val expectedResult = List()
    assert(actualResult === expectedResult)
  }

  //Test case for one element in the List
  "Duplicate method" should "be valid if the List has one element" in {
    val actualResult = duplicateElementsTest.duplicationOfElement(List('d'))
    val expectedResult = List('d','d')
    assert(actualResult === expectedResult)
  }

  //Test case for invalid output
  "Duplicate method " should "be invalid" in {
    val actualResult = duplicateElementsTest.duplicationOfElement(List(1.1,"some",2,'a','!'))
    val expectedResult = List(1.1,1.1,"some","some",2,2)
    assert(actualResult != expectedResult)
  }


}
