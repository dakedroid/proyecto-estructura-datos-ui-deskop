


fun main (){
    println("HOLA DESDE KOTLIN")
    MainJava.funcionJava()

    val listaColumnas = InicioUI.columnas

    listaColumnas.forEach {
        println(it)
    }
}

fun holaKotlin(){
    println("FUNCION LLAMADA DESDE KOTLIN")
}