package EstructurasLineales.Pilas

import java.util.*
import kotlin.collections.ArrayList

class ArrayListPila : Pila {

    private var pila : ArrayList<String> = ArrayList()

    override fun llenar(elemento: String) {
        pila.add(elemento)
    }

    override fun sacar(): String {

        val elementoASacar = tope()

        pila.remove(elementoASacar)

        return elementoASacar

    }

    override fun tope(): String {
        if (pila.isEmpty()){
            throw EmptyStackException()
        }
        return pila[pila.lastIndex]
    }

    override fun estaVacia(): Boolean {
        return pila.isEmpty()
    }

    override fun tamano(): Int {
        return pila.size
    }

}