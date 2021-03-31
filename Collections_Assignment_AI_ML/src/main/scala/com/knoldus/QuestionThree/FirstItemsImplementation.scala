//Collections Assignment,Author - Durgesh Gupta
package com.knoldus.QuestionThree

import scala.io.StdIn.{readInt, readLine}

object FirstItemsImplementation extends  App {
  val firstItemsImplementation = new FirstItemsApi()
  print("Enter the number of items of the list: " + "\n")
  val sizeOfList = readInt
  print("Enter the list items: " + "\n")
  val inputList: List[Any] = List.fill(sizeOfList){
    readLine
  }
  print("Enter the number of items you want: " + "\n")
  val countOfItems = readInt()

  if(countOfItems > sizeOfList){
    print("Enter count less than or equal to size of list..." + "\n")
  }
  else{
    print(firstItemsImplementation.first(inputList,countOfItems))
  }

}
