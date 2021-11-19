package EstructurasLineales.Pilas

fun main (){

   var pilaStrings : Pila = ArrayListPila()

   pilaStrings.llenar("PAPA 1")
   pilaStrings.llenar("PAPA 2")
   pilaStrings.llenar("PAPA 3")

   pilaStrings.sacar()
   pilaStrings.sacar()
   pilaStrings.sacar()

   println(pilaStrings.tope())

}

