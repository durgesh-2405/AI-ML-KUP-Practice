//Functional Assignment by Durgesh Gupta
package com.knoldus.Question8

class ConditionalApi {
  def conditional[Any](x: Any, p: Any => Boolean, f: Any => Any):Any = {
    if(p(x)) f(x) else x
  }

}
