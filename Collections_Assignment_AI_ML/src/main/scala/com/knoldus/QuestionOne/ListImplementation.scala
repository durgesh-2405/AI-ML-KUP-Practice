//Collections Assignment,Author - Durgesh Gupta
package com.knoldus.QuestionOne

/* Here are creating an object class ListImplementation
.*/

object ListImplementation extends App {

  /*We are creating the object of ListCreationApi to implement the methods defined
  * in the List Creation Api.
  * */

  val valueOne = 0L
  val valueTwo = 9L
  val valueThree = 20L
  val listImplementation = new ListCreationApi()
  print(listImplementation.usingForLoop(valueOne,valueTwo) + "\n")
  print(listImplementation.usingFilter(valueOne,valueThree) + "\n")
  print(listImplementation.usingMap(valueOne,valueTwo) + "\n")

}
