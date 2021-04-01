//OOPs Assignment of AI/Ml,Author - Durgesh Gupta
package com.knoldus.QuestionTwo.LinkedListImplementation

import com.knoldus.QuestionTwo.LinkedList.{EmptyList, LinkedListHelper, NonEmptyList}

object LinkedListImplementation extends App{
  val linkedListImplementation = new LinkedListHelper()
  val headOfList = 1
  val tailOfList = linkedListImplementation.create(0,1,3,2,1,0,2,3,1,2,0,1)

  /* Here we are executing the non empty list method.*/

  print("------------ Different Operation on the Non Empty Linked List------------- \n\n")

  val nonEmptyListObject = new NonEmptyList(headOfList,tailOfList)
  print("Elements of the linked list are:  ")
  nonEmptyListObject foreach print

  print("\nThe fourth element of the list is: " + nonEmptyListObject.apply(3) + "\n")
  print("The elements in the tail list are:")
  nonEmptyListObject.tail.foreach(print)

  print("\nThe value at head position is: " + nonEmptyListObject.head + "\n")

  print("The size of the list will be: " + nonEmptyListObject.size + "\n" )

  print("List in reverse order will be: ")

  nonEmptyListObject.reverse.foreach(print)

  print("\nFiltering the even numbers in the list: ")
  val filteredOutput = nonEmptyListObject.filter(_ % 2 == 0)
  filteredOutput.foreach(print)

  print("\nMultiplying each element with 2 using map method: ")
  val mappedResult = nonEmptyListObject.map(_ * 2)
  mappedResult.foreach(print)

  /* Here we are executing the empty list method.*/

  print("\n\n------------ Different Operation on the Empty Linked List------------- \n\n")

  val emptyList = linkedListImplementation.create()

  print("Elements of the list are: ")
  emptyList.foreach(print)

  print("\nSecond element in the list will be: " + emptyList.apply(1))

  print("\nElements at tail position will be: " + emptyList.tail)

  print("\nElement at head position will be: " + emptyList.headOption)

  print("\nThe size of the list will be: " + emptyList.size)





}
