package EstructurasLineales.Colas

fun main (){

    var colaStrings : Cola = ArrayListCola()

    colaStrings.formar("GAEL")
    colaStrings.formar("ELIANETH")
    colaStrings.formar("AGUSTIN")
    colaStrings.formar("CHRISTIAN")

    colaStrings.salirFila()
    colaStrings.salirFila()
    colaStrings.salirFila()



    println(colaStrings.tope())
}