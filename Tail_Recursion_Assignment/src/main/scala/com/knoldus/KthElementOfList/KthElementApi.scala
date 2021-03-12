//Tail Recursion Assignment by Durgesh Gupta
package com.knoldus.KthElementOfList

import scala.annotation.tailrec

class KthElementApi {
  @tailrec
  final def kthElementOfList[A](indexK: Int, inputlist: List[A]):A = (indexK, inputlist) match{
    case (0, headOfList::_) => headOfList
    case(indexK, _::tailOfList) if indexK > 0 => kthElementOfList(indexK-1, tailOfList)
    case _ => throw new NoSuchElementException
  }

}
