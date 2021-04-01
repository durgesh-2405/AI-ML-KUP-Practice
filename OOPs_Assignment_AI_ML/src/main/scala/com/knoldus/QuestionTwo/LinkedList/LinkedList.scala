//OOPs Assignment of AI/Ml,Author - Durgesh Gupta
package com.knoldus.QuestionTwo.LinkedList

class LinkedList[A](items: A*) {
  val item: Option[A] = items.headOption
  val next: Option[LinkedList[A]] = {
    if (item.isDefined) {
      Some(new LinkedList(items.tail: _*))
    }
    else {
      None
    }
  }

  def foreach(elements: A => Unit ): Unit = {
    for {element <- item; nextElement <- next}{
      elements(element)
      nextElement.foreach(elements)
    }
  }

  def apply(index: Int): Option[A] = {
    if (index < 1) {
      item
    }
    else {
      next flatMap (_.apply(index - 1))
    }
  }
}

object LinkedListList extends App {
  val inputList = new LinkedList(1,0,2,3,1,2,3,2)
  print("Head Element: " + inputList.item + "\n")

  print("Items of List: ")
  inputList.foreach(print)



}


