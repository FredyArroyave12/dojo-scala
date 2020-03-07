//https://scala-2.gitbook.io/scala/for-and-foreach
object ejercicio  {

  def main(args: Array[String]): Unit = {
        val numeros = List(4, 8, 15, 16, 23, 42);
        val dobles = numeros.map {x => 2*x}
        println(dobles)
    
  }
  
}