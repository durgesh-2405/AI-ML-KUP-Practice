//Tail Recursion Assignment by Durgesh Gupta
package com.knoldus.ListReverseTest

import com.knoldus.ListReverse.ListReverseApi
import org.scalatest.flatspec.AnyFlatSpec

class ReverseListTest extends  AnyFlatSpec{
  val negativeInput:Double = -2
  val reverseListTest = new ListReverseApi()

  //Test cases for Character Type
  "The reverse" should "be valid if all the elements in the List are of Character Type" in {
    val actualResult = reverseListTest.reversedList(List('D','u','r','g','e','s','h'))
    val expectedResult = List('h','s','e','g','r','u','D')
    assert(actualResult === expectedResult)
  }

  "The reverse" should "be valid if there is only one element in the List of Character Type" in {
    val actualResult = reverseListTest.reversedList(List('D'))
    val expectedResult = List('D')
    assert(actualResult === expectedResult)
  }

  //Test cases for Integer Type
  "The reverse" should "be valid if all the elements in the List are of Integer Type" in {
    val actualResult = reverseListTest.reversedList(List(0,1,2,3))
    val expectedResult = List(3,2,1,0)
    assert(actualResult === expectedResult)
  }

  "The reverse" should "be valid if there is only one element in the List of Integer Type" in {
    val actualResult = reverseListTest.reversedList(List(1))
    val expectedResult = List(1)
    assert(actualResult == expectedResult)
  }


  //Test cases for Any Type
  "The reverse" should "be valid if all the elements in the List are of Any Type" in {
    val actualResult = reverseListTest.reversedList(List(0.1,"Durgesh","Gupta",'a',"string",'%','x',negativeInput))
    val expectedResult = List(negativeInput, 'x', '%',"string",'a',"Gupta","Durgesh",0.1)
    assert(actualResult === expectedResult)
  }

  "The reverse " should "be valid if there is only one element in the List of Any Type" in {
    val actualResult = reverseListTest.reversedList(List(negativeInput))
    val expectedResult = List(negativeInput)
    assert(actualResult === expectedResult)
  }

  //Test case for the List is empty
  "The reverse" should "be valid if the List is empty" in {
    val actualResult = reverseListTest.reversedList(List())
    val expectedResult = List()
    assert(actualResult === expectedResult)
  }

  //Test case for invalid output
  "The reverse" should "be invalid" in {
    val actualResult = reverseListTest.reversedList(List('D','u','r','g','e','s','h'))
    val expectedResult = List('D','u','r','g','e','s','h')
    assert(actualResult != expectedResult)
  }

}
