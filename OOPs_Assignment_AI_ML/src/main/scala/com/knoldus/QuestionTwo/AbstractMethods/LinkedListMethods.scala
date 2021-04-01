//OOPs Assignment of AI/Ml,Author - Durgesh Gupta
package com.knoldus.QuestionTwo.AbstractMethods

import com.knoldus.QuestionTwo.LinkedList.{EmptyList, NonEmptyList}
import org.graalvm.compiler.core.common.util.ReversedList

import java.util
import scala.::
import scala.annotation.tailrec

abstract class LinkedListMethods[A] {

  def foreach(elements: A => Unit) : Unit

  def apply(index: Int): Option[A]

  def headOption: Option[A] = apply(0)

  lazy val head: A = headOption.get

  def tail: LinkedListMethods[A]

  def ::(a: A): LinkedListMethods[A] = new NonEmptyList[A](a, this)


  def filter (f: A => Boolean): LinkedListMethods[A] = {
    @tailrec
    def filterLists(src: LinkedListMethods[A], dest: LinkedListMethods[A], f: A=>Boolean): LinkedListMethods[A] = {
      src.headOption match {
        case Some(i) if f(i) => filterLists(src.tail, i:: dest, f)
        case Some(i) => filterLists(src.tail,dest,f)
        case None => dest
      }
    }
    val result: LinkedListMethods[A] = filterLists(this,new EmptyList[A],f)
    result.reverse
  }

  lazy val size: Int = {
    @tailrec
    def count(inputList: LinkedListMethods[A], sizeOfList: Int): Int ={
      inputList.headOption match {
        case Some(i) => count(inputList.tail, sizeOfList + 1)
        case None => sizeOfList
      }
    }
    count(this,0)
  }

  def map[B](f: A=>B): LinkedListMethods[B] ={
    @tailrec
    def mapLists[B](src: LinkedListMethods[A], dest: LinkedListMethods[B], f: A=> B): LinkedListMethods[B]= {
      src.headOption match {
        case Some(i) => mapLists(src.tail,f(i) :: dest, f)
        case None => dest
      }
    }
    val result: LinkedListMethods[B] = mapLists(this, new EmptyList[B],f)
    result.reverse
  }

  lazy val reverse: LinkedListMethods[A] = {
    @tailrec
    def reverseLists(inputList: LinkedListMethods[A], reversedList: LinkedListMethods[A]): LinkedListMethods[A] = {
      inputList.headOption match {
        case Some(i) => reverseLists(inputList.tail, i :: reversedList)
        case None => reversedList
      }

    }
    reverseLists(this,new EmptyList[A])
  }







}
