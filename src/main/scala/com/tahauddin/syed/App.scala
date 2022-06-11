package com.tahauddin.syed

object App {

  def main(args: Array[String]): Unit = {

    val car = new Car
    val totalCost = car.totalCost(30000)
    println(totalCost)
    car.topSpeed = 300
    println(car.topSpeed)
  }

}
