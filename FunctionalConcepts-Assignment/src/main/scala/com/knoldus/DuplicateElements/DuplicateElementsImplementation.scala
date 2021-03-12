//Functional Assignment by Durgesh Gupta
package com.knoldus.DuplicateElements

import scala.io.StdIn.{readInt, readLine}

object DuplicateElementsImplementation extends App {
  print("Enter the size of list: \n")
  val sizeOfList = readInt()
  print("Enter the input list: \n")
  val inputList: List[Any] = List.fill(sizeOfList){
    readLine()
  }

  val duplicateElementsImplementation = new DuplicateElementsApi()
  val result = duplicateElementsImplementation.duplicationOfElement(inputList)
  print(result)

}
