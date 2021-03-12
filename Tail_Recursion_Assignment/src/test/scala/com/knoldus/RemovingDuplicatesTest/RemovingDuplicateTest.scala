//Tail Recursion Assignment by Durgesh Gupta
package com.knoldus.RemovingDuplicatesTest

import com.knoldus.RemovingDuplicates.RemovingDuplicatesApi
import org.scalatest.flatspec.AnyFlatSpec

class RemovingDuplicateTest extends AnyFlatSpec {
  val negativeInput: Double = -2
  val removingDuplicateTest = new RemovingDuplicatesApi()
  //Test cases for Character Type List
  "The output" should "be valid if the List is of Character Type" in {
    val actualResult = removingDuplicateTest.removingDuplicate(List('a','a','a','b','c','c','d','d','e'),Nil)
    assert(actualResult == List('a','b','c','d','e'))
  }

  "The output" should "be valid if the List is of Characters contains only one element " in {
    val actualResult = removingDuplicateTest.removingDuplicate(List('a'),Nil)
    assert(actualResult == List('a'))
  }

  //Test cases for Integer Type List
  "The Element" should "be valid if the List is of Integer Type" in {
    val actualResult = removingDuplicateTest.removingDuplicate(List(1,2,1,2,3),Nil)
    assert(actualResult === List(1,2,3))
  }

  "The output" should "be valid if the List is of Integer contains only one element " in {
    val actualResult = removingDuplicateTest.removingDuplicate(List(1),Nil)
    assert(actualResult == List(1))
  }


  //Test cases for Any Type List
  "The output" should "be valid if the List is of Any Type" in {
    val actualResult = removingDuplicateTest.removingDuplicate(List(0.1,"Durgesh","gupta",'a',"Durgesh",'%',negativeInput),Nil)
    assert(actualResult == List(0.1,"Durgesh","gupta",'a','%',negativeInput))
  }

  "The output" should "be valid if the List is of Any Type contains only one element " in {
    val actualResult = removingDuplicateTest.removingDuplicate(List("*"),Nil)
    assert(actualResult === List("*"))
  }

  //Test case when empty List is passed
  "The output" should "be valid if the List is empty" in {
    val actualResult = removingDuplicateTest.removingDuplicate(List(),Nil)
    assert(actualResult === List())
  }

  //Test case to check invalid results
  "The output" should "be invalid" in {
    val actualResult = removingDuplicateTest.removingDuplicate(List(0.1,"Durgesh","gupta",'a',"Durgesh",'%',negativeInput),Nil)
    val expectedResult = List("*")
    assert(actualResult != expectedResult)
  }


}
