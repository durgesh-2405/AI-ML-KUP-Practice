//Tail Recursion Assignment by Durgesh Gupta
package com.knoldus.SlicingList

import scala.annotation.tailrec

class SlicingListApi {
  @tailrec
  final def slicedList(startIndex: Int, numberOfElements: Int, outputList: List[Any]):List[Any] = (startIndex, numberOfElements, outputList) match {
    case (0,0, outputList) => outputList
    case (0, numberOfElements, outputList) => slicedList(0, numberOfElements-1, outputList.init)
    case (startIndex, numberOfElements, _ :: outputList) => slicedList(startIndex-1, numberOfElements, outputList)
  }
  def listSlicing(ithIndex: Int, kthIndex: Int, inputList: List[Any]): List[Any]= {
    slicedList(ithIndex,kthIndex-ithIndex, inputList)
  }


}
