class Hello {
  def apply() = 1
}

object Hello {
  def main(args: Array[String]): Unit = {
    val a = new Hello()()
    println(a)
  }
}
