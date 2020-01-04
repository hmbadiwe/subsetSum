package com.example.disney

object ProgrammingQuestion extends App {


  def subsetSum(k: Int, numbers: Set[Int]): Option[Set[Int]] = {
    if(numbers.isEmpty) None
    else numbers.subsets().find(_.sum == k)
  }


}
