abstract class Element {
  def demo() = {
    println("hi")
  }

}

class ArrayElement extends Element {
  override def demo() = {
    println("hello")
  }

}

class Matrix extends  ArrayElement {
  override  def demo() = {
    print("bye")
  }
}

class UniformElement extends Element {
  def invoke
}


class Tiger {
  override val
}