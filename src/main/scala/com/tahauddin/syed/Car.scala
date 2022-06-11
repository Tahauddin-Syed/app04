package com.tahauddin.syed

/**
 * default access modifiers of variables are public
 * hence it can be access outside the class.
 *
 */
class Car {

  var topSpeed = 350
  private val mileage = 15
  var makingCost = 55000

  def totalCost(basicCost: Int): Double = {
    return (basicCost + makingCost ) * topSpeed
  }

}
