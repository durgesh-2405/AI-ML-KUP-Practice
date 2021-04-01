//OOPs Assignment of AI/Ml,Author - Durgesh Gupta
package com.knoldus.QuestionTwo.LinkedList

import com.knoldus.QuestionTwo.AbstractMethods.LinkedListMethods

class EmptyList[A] extends LinkedListMethods[A]{

  override def foreach(elements: A => Unit): Unit = {}

  override def apply(index: Int): Option[A] = None

  override def tail: LinkedListMethods[A] = {
    null
  }


}
