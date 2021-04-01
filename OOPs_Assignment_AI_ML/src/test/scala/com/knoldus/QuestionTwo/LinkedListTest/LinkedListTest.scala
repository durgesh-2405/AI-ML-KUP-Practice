//OOPs Assignment of AI/Ml,Author - Durgesh Gupta
package com.knoldus.QuestionTwo.LinkedListTest

import com.knoldus.QuestionTwo.LinkedList.LinkedList
import org.scalatest.flatspec.AnyFlatSpec

class LinkedListTest extends AnyFlatSpec{
  val one = 1
  val two = 2
  val three = 3
  val four = 4
  val listOfIntegerTest = new LinkedList(one,two,three,four)
  val listOfDoubleTest = new LinkedList(1.3,1,2.4,32.16)
  val listOfStringTest = new LinkedList("Ronaldo","Messi","Ziyech")
  val listOfCharTest = new LinkedList('R','o','n','a','d','o')

  /* Unit Test cases defined to test apply method with Integer type data.
  * */
  "apply method for Integer values" should "be valid" in {
    val actualResult = listOfIntegerTest.apply(1)
    val expectedResult = Some(2)
    assert(actualResult === expectedResult)
  }

  "apply method for Integer values" should "be invalid" in {
    val actualResult = listOfIntegerTest.apply(1)
    val expectedResult = Some(1)
    assert(actualResult != expectedResult)
  }

  /* Unit Test cases defined to test apply method with double type data.
   * */
  "apply method for values of Double type" should "be valid" in {
    val actualResult = listOfDoubleTest.apply(1)
    val expectedResult = Some(1.0)
    assert(actualResult === expectedResult)
  }

  "apply method for values of Double type" should "be invalid" in {
    val actualResult = listOfDoubleTest.apply(1)
    val expectedResult = Some(1.3)
    assert(actualResult != expectedResult)
  }


  /* Unit Test cases defined to test apply method with String type data.
  * */
  "apply method for Strings " should "be valid" in {
    val actualResult = listOfStringTest.apply(1)
    val expectedResult = Some("Messi")
    assert(actualResult === expectedResult)
  }

  "apply method for Strings " should "be invalid" in {
    val actualResult = listOfStringTest.apply(1)
    val expectedResult = Some("Ronaldo")
    assert(actualResult != expectedResult)
  }


  /* Unit Test cases defined to test apply method with char type data.
 * */
  "apply method for Character values" should "be valid" in {
    val actualResult = listOfCharTest.apply(1)
    val expectedResult = Some('o')
    assert(actualResult === expectedResult)
  }

  "apply method for Character values" should "be invalid" in {
    val actualResult = listOfCharTest.apply(1)
    val expectedResult = Some('R')
    assert(actualResult != expectedResult)
  }



}
