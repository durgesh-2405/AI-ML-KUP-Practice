//OOPs Assignment of AI/Ml,Author - Durgesh Gupta
package com.knoldus.QuestionTwo.AbstractMethodsTest

import com.knoldus.QuestionTwo.AbstractMethods.LinkedListMethods
import com.knoldus.QuestionTwo.LinkedList.{EmptyList, LinkedListHelper, NonEmptyList}
import org.scalatest.flatspec.AnyFlatSpec

class LinkedListAbstractMethodsTest extends AnyFlatSpec {

  val listAbstractMethodsTest = new LinkedListHelper()
  val headOfIntList = 1
  val tailOfIntList: LinkedListMethods[Int] = listAbstractMethodsTest.create(0,1,2,3,3,2,1,0)
  val nonEmptyIntList = new NonEmptyList(headOfIntList,tailOfIntList)
  val headOfStringList = "abc"
  val tailOfStringList: LinkedListMethods[String] = listAbstractMethodsTest.create("pqr", "xyz", "Ronaldo", "Messi")
  val nonEmptyStringList = new NonEmptyList(headOfStringList,tailOfStringList)
  val emptyList =new EmptyList()

  /* Here we are writing unit test cases to test non- empty list of Integer type.
  * */
  "The head for Non-Empty Integer List " should "be valid" in {
    val actualResult = nonEmptyIntList.head
    val expectedResult = 1
    assert(actualResult === expectedResult)
  }

  "The head for Non-Empty Integer List " should "be invalid" in {
    val actualResult = nonEmptyIntList.head
    val expectedResult = 0
    assert(actualResult != expectedResult)
  }

  "The size method for Non-Empty Integer List " should "be valid" in {
    val actualResult = nonEmptyIntList.size
    val expectedResult = 9
    assert(actualResult === expectedResult)
  }

  "The size method for Non-Empty Integer List" should "be invalid" in {
    val actualResult = nonEmptyIntList.size
    val expectedResult = 7
    assert(actualResult != expectedResult)
  }

  "The apply method for Non-Empty Integer List" should "be valid" in {
    val actualResult = nonEmptyIntList.apply(0)
    val expectedResult = Some(1)
    assert(actualResult === expectedResult)
  }

  "TThe apply method for Non-Empty Integer List" should "be invalid" in {
    val actualResult = nonEmptyIntList.apply(0)
    val expectedResult = Some(0)
    assert(actualResult != expectedResult)
  }

  /* Here we are writing unit test cases to test non- empty list of String type.
  * */

  "The head for Non-Empty String List" should "be valid" in {
    val actualResult = nonEmptyStringList.head
    val expectedResult = "abc"
    assert(actualResult === expectedResult)
  }

  "The head for Non-Empty String List" should "be invalid" in {
    val actualResult = nonEmptyStringList.head
    val expectedResult = "pqr"
    assert(actualResult != expectedResult)
  }

  "The size method for Non-Empty String List" should "be valid" in {
    val actualResult = nonEmptyStringList.size
    val expectedResult = 5
    assert(actualResult === expectedResult)
  }

  "The size method for Non-Empty String List" should "be invalid" in {
    val actualResult = nonEmptyStringList.size
    val expectedResult = 6
    assert(actualResult != expectedResult)
  }

  "The apply method for Non-Empty String List" should "be valid" in {
    val actualResult = nonEmptyStringList.apply(0)
    val expectedResult = Some("abc")
    assert(actualResult === expectedResult)
  }

  "The apply method for Non-Empty String List " should "be invalid" in {
    val actualResult = nonEmptyStringList.apply(0)
    val expectedResult = Some("pqr")
    assert(actualResult != expectedResult)
  }

  /* Here we are writing unit test cases to test empty list.
  * */

  "The head for Empty List" should "be valid" in {
    val actualResult = emptyList.headOption
    val expectedResult = None
    assert(actualResult === expectedResult)
  }


  "The head method for Empty List" should "be invalid" in {
    val actualResult = emptyList.headOption
    val expectedResult = Some(1)
    assert(actualResult != expectedResult)
  }


  "The size method for Empty List" should "be valid" in {
    val actualResult = emptyList.size
    val expectedResult = 0
    assert(actualResult === expectedResult)
  }


  "The size method for Empty List" should "be invalid" in {
    val actualResult = emptyList.size
    val expectedResult = 1
    assert(actualResult != expectedResult)
  }


  "The apply method for Empty List" should "be valid" in {
    val actualResult = emptyList.apply(0)
    val expectedResult = None
    assert(actualResult === expectedResult)
  }

  "The apply method for Empty List" should "be invalid" in {
    val actualResult = emptyList.apply(0)
    val expectedResult = Some(0)
    assert(actualResult != expectedResult)
  }




}
