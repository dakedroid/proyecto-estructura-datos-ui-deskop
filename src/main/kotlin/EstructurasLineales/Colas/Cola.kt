package EstructurasLineales.Colas

interface Cola {

    val cuenta: Int

    val estaVacia: Boolean

    fun tope(): String?

    fun formar(elemento: String): Boolean

    fun salirFila(): String?

}