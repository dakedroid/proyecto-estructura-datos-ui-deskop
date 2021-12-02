import kotlin.system.measureNanoTime
import kotlin.system.measureTimeMillis

fun busquedaPorKotlin(list: List<String>, valorABuscar: String) {


    var tiempo = measureNanoTime {

        val valorEncontrado = list.find { nombre ->

            nombre.contains(valorABuscar)

        }

        println(valorEncontrado)

    }

    println("TIEMPO BUSQUEDA KOTLIN: $tiempo")

}


fun busquedaLineal(list: List<String>, valorABuscar: String): Int? {

    var tiempo = measureNanoTime {
        for ((index, valor) in list.withIndex()) {
            if (valor == valorABuscar) {
                println("POSICION ENCONTRADA: $index -> $valor")
                return index
            }
        }
    }

    println("TIEMPO BUSQUEDA LINEAL: $tiempo")



    return null

}

fun busquedaBinaria(list: List<String>, key: String): Int? {

    var tiempo = measureNanoTime {

        var rangeStart = 0
        var rangeEnd = list.count()
        while (rangeStart < rangeEnd) {
            val midIndex = rangeStart + (rangeEnd - rangeStart) / 2
            if (list[midIndex] == key) {
                println("INDEX ENCONTRADO: $midIndex")
                return midIndex
            } else if (list[midIndex] < key) {
                rangeStart = midIndex + 1
            } else {
                rangeEnd = midIndex
            }
        }

    }

    println("TIEMPO BUSQUEDA BINARIA : $tiempo")

    return null
}


fun main() {

}
