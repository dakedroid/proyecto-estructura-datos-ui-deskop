package EstructurasLineales.ListasEnlazadas

fun main (){

    val lista = Nodo( "1",  Nodo( "2", Nodo("3", Nodo("4", Nodo("5")))))

    println(lista)

    lista.imprimirReverso()

}