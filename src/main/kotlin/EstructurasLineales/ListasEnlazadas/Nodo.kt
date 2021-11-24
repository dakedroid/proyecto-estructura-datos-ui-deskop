package EstructurasLineales.ListasEnlazadas


data class Nodo<String>(var valor: String, var siguiente: Nodo<String>? = null) {

    override fun toString(): kotlin.String {
        return if (siguiente != null) {
            "$valor -> ${siguiente.toString()}"
        } else {
            "$valor"
        }
    }


    fun imprimirReverso() {
        siguiente?.imprimirReverso()

        if (siguiente != null) {
            print(" -> ")
        }
        print(valor.toString())
    }

}