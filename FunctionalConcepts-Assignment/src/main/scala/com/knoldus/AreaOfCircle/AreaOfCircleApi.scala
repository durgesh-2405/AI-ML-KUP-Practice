//Functional Assignment by Durgesh Gupta
package com.knoldus.AreaOfCircle
/* In the class AreaOfCircleApi we have created a method which will rreturn the area
* of the circle.*/
class AreaOfCircleApi {
  def areaOfCircle(inputRadius: String): Double = if (inputRadius.isEmpty) {
    0
  } else {
    math.pow(inputRadius.toDouble, 2) * math.Pi
  }

}
