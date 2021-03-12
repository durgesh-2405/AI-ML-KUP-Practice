//Tail Recursion Assignment by Durgesh Gupta
package com.knoldus.ListReverse

import scala.annotation.tailrec

class ListReverseApi {
  @tailrec
  final def reverse(outputList: List[Any], inputList: List[Any]): List[Any] = inputList match {
    case Nil => outputList
    case headOfList :: tailOfList => reverse(headOfList :: outputList, tailOfList)
  }

  def reversedList(inputList: List[Any]): List[Any]={
    reverse(Nil, inputList)
  }

}
