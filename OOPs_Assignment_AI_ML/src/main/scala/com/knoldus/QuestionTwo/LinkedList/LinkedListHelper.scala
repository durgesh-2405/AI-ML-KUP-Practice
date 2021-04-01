//OOPs Assignment of AI/Ml,Author - Durgesh Gupta
package com.knoldus.QuestionTwo.LinkedList

import com.knoldus.QuestionTwo.AbstractMethods.LinkedListMethods

class LinkedListHelper {
  def create[A](items: A*): LinkedListMethods[A] = {
    var result: LinkedListMethods[A] = new EmptyList[A]
    for (item <- items.reverse){
      result = new NonEmptyList[A](item, result)
    }
    result
  }

}
