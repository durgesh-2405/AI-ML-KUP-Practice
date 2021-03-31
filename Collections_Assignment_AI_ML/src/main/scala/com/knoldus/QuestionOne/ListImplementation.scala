//Collections Assignment,Author - Durgesh Gupta
package com.knoldus.QuestionOne

object ListImplementation extends App {

  val valueOne = 0L
  val valueTwo = 9L
  val valueThree = 20L
  val listImplementation = new ListCreationApi()
  print(listImplementation.usingForLoop(valueOne,valueTwo) + "\n")
  print(listImplementation.usingFilter(valueOne,valueThree) + "\n")
  print(listImplementation.usingMap(valueOne,valueTwo) + "\n")

}
