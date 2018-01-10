val list = List(2,3,1,5,6)

def min(list: List[Int]): Int = {
  list match {
    case head :: head2 :: tail if (head >= head2) => min(head2 :: tail)
    case head :: head2 :: tail if (head <= head2) => min(head :: tail)
    case head :: Nil => head
  }
}

min(list)

val num = 5
val mul = num
def factorial(num: Int): Int = {
  num match {
    case 1 => 1
    case num => num * factorial(num - 1)

  }

}

factorial(5)

