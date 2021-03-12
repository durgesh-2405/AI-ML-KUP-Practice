//Functional Assignment by Durgesh Gupta
package com.knoldus.ListSplit
/*In this class ListSplitApi we have created a method which will split the list into two parts
* after the n number of values.*/

class ListSplitApi {
  def splitListFunction(numberSplit: Int, inputList: List[Any]): (List[Any],List[Any]) = {
    (inputList.take(numberSplit),inputList.drop(numberSplit))
  }

}
