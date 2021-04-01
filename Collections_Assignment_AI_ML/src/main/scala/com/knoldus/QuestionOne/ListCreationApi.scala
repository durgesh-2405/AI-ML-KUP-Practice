//Collections Assignment,Author - Durgesh Gupta
package com.knoldus.QuestionOne

/* Here we are creating a class ListCreationApi containing three methods
* usingForLoop, usingFilter, usingMap to create the list of odd numbers
* */

class ListCreationApi {

  /*Here we are creating for loop method to create the list of odd  numbers.
  * */
  def usingForLoop (startValue: Long, endValue: Long): IndexedSeq[Long] ={
    for (iterator <- startValue to endValue; value = iterator * 2 + 1) yield value
  }

  /*Here we are creating filter method to create the list of odd  numbers.
  * */
  def usingFilter(startValue: Long, endValue: Long): IndexedSeq[Long] = {
    startValue to endValue filter(_ % 2 == 1)
  }

  /*Here we are creating Map method to create the list of odd  numbers.
  * */
  def usingMap(startValue: Long, endValue: Long): IndexedSeq[Long] ={
    startValue to endValue map(_ * 2 + 1)
  }

}
