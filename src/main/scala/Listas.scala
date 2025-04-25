import scala.collection.immutable.List
import scala.collection.mutable.Map

object Listas {
    def main (args: Array[String]): Unit = {
        ejercicio1()
        ejercicio2()
        ejercicio3()
    }


    // Ejercicio 1: Elimina duplicados y cuenta ocurrencias
    //val palabras = List("gato", "perro", "gato", "loro", "perro", "gato")
    private def ejercicio1(): Unit = {
        val palabras = List("gato", "perro", "gato", "loro", "perro", "gato")


    }


    //Ejercicio 2: Encuentra el segundo mayor
    private def ejercicio2(): Unit = {
        val numeros = List(5, 3, 9, 1, 9, 7)
        val numSinDuplicados = numeros.distinct
        val ordenadosMayorAMenor = numSinDuplicados.sorted.reverse
        if (ordenadosMayorAMenor.length > 1) {
            println(ordenadosMayorAMenor(1))
        } else {
            println("No hay un segundo número mayor")
        }
    }

    //Ejercicio 3: Dada una lista de números, filtra los que sean múltiplos de 3 y mayores que 10,  
    //y luego crea una nueva lista con el doble de esos valores.
    private def ejercicio3(): Unit = {
        val numeros = List(3, 6, 12, 18, 20, 21, 9)
        val numerosFiltrados = numeros.filter(_ % 3 == 0).filter(_ >10).map(_ * 2)
        println(numerosFiltrados)
    }
}