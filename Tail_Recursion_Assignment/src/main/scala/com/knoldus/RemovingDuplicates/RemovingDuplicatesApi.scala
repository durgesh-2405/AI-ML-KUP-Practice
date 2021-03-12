//Tail Recursion Assignment by Durgesh Gupta
package com.knoldus.RemovingDuplicates

import scala.annotation.tailrec

class RemovingDuplicatesApi {
  @tailrec
  final def removingDuplicate(inputList: List[Any], outputList: List[Any]): List[Any] = inputList match{
    case Nil => outputList.reverse
    case headOfList :: tailOfList => if (outputList.contains(headOfList)){
      removingDuplicate(tailOfList, outputList)
    }
      else{
      removingDuplicate(tailOfList, headOfList :: outputList)
    }
  }

}
