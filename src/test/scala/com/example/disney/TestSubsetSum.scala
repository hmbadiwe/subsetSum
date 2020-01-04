package com.example.disney

import org.scalatest.wordspec.AnyWordSpec
import org.scalatest.matchers.should.Matchers
import com.example.disney.ProgrammingQuestion.subsetSum
import scala.util.Random
class TestSubsetSum extends AnyWordSpec with Matchers {
  "Subset func" when {
    "invoked with an empty set" should {
      "return None" in{
        subsetSum(Random.nextInt(), Set.empty[Int]) shouldBe None
      }
    }
    "invoked with a non-empty set" when {
      "the only value that matches is the whole set" should {
        "return the whole set" in {
          subsetSum(15, Set(1,2,3,4,5)) shouldBe Some(Set(1,2,3,4,5))
        }
      }
      "there are multiple potential matches" should {
        "return a match that equals to k" in {
          val k = 5
          subsetSum(k, Set(1,2,3,4,5)).map(_.sum) shouldBe Some(k)
        }
      }
    }
  }
}
