package EstructurasLineales.Colas

class ArrayListCola : Cola {

    private var cola = ArrayList<String>()

    override val cuenta: Int
        get() = cola.size

    override val estaVacia: Boolean
        get() = (cuenta == 0)

    override fun tope(): String? {
        return cola.getOrNull(0)
    }

    override fun formar(elemento: String): Boolean {
        return cola.add(elemento)
    }

    override fun salirFila(): String? {
        return if (estaVacia) null else cola.removeAt(0)
    }


}