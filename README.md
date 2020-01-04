# Subset Sum
## Description
Given a set of numbers s and a value k, subsetSum finds a subset of s that has a sum that equals k.  
If s is empty, the function returns None

## Example
```scala
  subsetSum(5, Set(1,2,3,4,5)) shouldBe Some(Set(1,4)) // or could be Some(Set(2,3))
  subsetSum(Int.MaxValue, Set.empty[Int]) shouldBe None
```
