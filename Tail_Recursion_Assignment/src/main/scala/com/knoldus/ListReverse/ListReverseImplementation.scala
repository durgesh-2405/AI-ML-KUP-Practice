//Tail Recursion Assignment by Durgesh Gupta
package com.knoldus.ListReverse

import scala.io.StdIn.{readInt, readLine}

object ListReverseImplementation extends App{
  val listReverseImplementation = new ListReverseApi()
  print("Enter the size of the list: \n")
  val sizeOfList = readInt()
  print("Enter the input list: \n")
  val inputList: List[Any] = List.fill(sizeOfList){
    readLine()
  }
  val result = listReverseImplementation.reversedList(inputList)

  print(result)

}
