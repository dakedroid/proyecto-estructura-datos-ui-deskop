package EstructurasLineales.Pilas

interface Pila {

    fun llenar(elemento: String)

    fun sacar(): String

    fun tope(): String

    fun estaVacia(): Boolean

    fun tamano(): Int

}