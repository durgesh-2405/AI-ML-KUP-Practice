//Collections Assignment,Author - Durgesh Gupta
package com.knoldus.QuestionOneTest

import com.knoldus.QuestionOne.ListCreationApi
import org.scalatest.flatspec.AnyFlatSpec


/* Here we are creating the unit test cases to test the different methods
* of for loop, filter, and map methods
* */
class CreationOfListTest extends AnyFlatSpec{

  val creationOfListTest = new ListCreationApi
  val one = 1
  val three = 3
  val five = 5
  val seven = 7
  val nine = 9
  val eleven = 11
  val thirteen = 13
  val fifteen = 15
  val seventeen = 17
  val nineteen = 19
  val valueOne = 0L
  val valueTwo = 9L
  val valueThree = 20L

  "For loop method" should "be valid " in {
    val actualResult= creationOfListTest.usingForLoop(valueOne,valueTwo)
    assert(actualResult == List(one,three,five,seven,nine,eleven,thirteen,fifteen,seventeen,nineteen)  )
  }

  "For loop method" should "be invalid " in {
    val actualResult= creationOfListTest.usingForLoop(valueOne,valueTwo)
    assert(actualResult != List(one,five,seven,nine,eleven,thirteen,fifteen,seventeen,nineteen)  )
  }

  "Filter method" should "be valid " in {
    val actualResult= creationOfListTest.usingFilter(valueOne,valueThree)
    assert(actualResult == List(one,three,five,seven,nine,eleven,thirteen,fifteen,seventeen,nineteen)  )
  }

  "Filter method" should "be invalid " in {
    val actualResult= creationOfListTest.usingFilter(valueOne,valueThree)
    assert(actualResult != List(one,three,five,seven,nine,eleven,fifteen,seventeen,nineteen)  )
  }


  "Map method" should "be valid " in {
    val actualResult= creationOfListTest.usingMap(valueOne,valueTwo)
    assert(actualResult == List(one,three,five,seven,nine,eleven,thirteen,fifteen,seventeen,nineteen)  )
  }

  "Map method" should "be invalid " in {
    val actualResult= creationOfListTest.usingMap(valueOne,valueTwo)
    assert(actualResult != List(one,three,five,seven,nine,thirteen,fifteen,seventeen,nineteen)  )
  }


}
