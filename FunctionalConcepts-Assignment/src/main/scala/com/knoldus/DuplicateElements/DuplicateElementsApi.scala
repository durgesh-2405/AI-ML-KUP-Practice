//Functional Assignment by Durgesh Gupta
package com.knoldus.DuplicateElements

class DuplicateElementsApi {
  def duplicationOfElement(inputlist: List[Any]): List[Any] ={
    inputlist flatMap { element => List(element,element)}
  }

}
