//Functional Assignment by Durgesh Gupta
package com.knoldus.ListSplit

import scala.io.StdIn.{readInt, readLine}

object ListSplitImplementation extends App {

  print("Enter the size of list: \n")
  val sizeOfList = readInt()
  print("Enter the input list: \n")
  val inputList: List[Any] = List.fill(sizeOfList){
    readLine()
  }
  print("Enter the number at which split will be done:  \n")
  val numberSplit = readInt()

  val listSplitImplementation= new ListSplitApi()
  val result = listSplitImplementation.splitListFunction(numberSplit,inputList)
  print(result)



}
