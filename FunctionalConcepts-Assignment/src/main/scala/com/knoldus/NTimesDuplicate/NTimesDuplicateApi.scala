//Functional Assignment by Durgesh Gupta
package com.knoldus.NTimesDuplicate
/*In this class NTimeSDuplicateApi we have created a method which will duplicate the elements
* of the list according to given times of duplication*/
class NTimesDuplicateApi {
  def duplicateNTimes(numberOfDuplication: Int, inputList: List[Any]): List[Any] = {
    inputList flatMap {
      List.fill(numberOfDuplication)(_)
    }
  }

}
