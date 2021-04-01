//OOPs Assignment of AI/Ml,Author - Durgesh Gupta
package com.knoldus.QuestionTwo.LinkedList

import com.knoldus.QuestionTwo.AbstractMethods.LinkedListMethods

class NonEmptyList[A](val item: A, val tail: LinkedListMethods[A]) extends LinkedListMethods[A] {
  override def foreach(elements: A => Unit): Unit = {
    elements(item)
    tail.foreach(elements)
  }

  override def apply(index: Int): Option[A] = {
    if(index < 1){
      Some(item)
    }
    else{
      tail.apply(index - 1)
    }
  }

}
