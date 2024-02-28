class Pila<T>{
    val lista:MutableList<T> = mutableListOf()
    //añade a la lista el nuevo elemento.
    fun push(nuevo:T){
        lista.add(nuevo)
    }
    //retorna el ultimo introducido
    fun top():T?{
        if (lista.isEmpty()){
            return null
        }
        return lista[lista.size - 1]
    }
    //elimina el ultimo introducido
    fun pop():T?{
        if (lista.isEmpty()){
            return null
        }
        return lista.removeLast()
    }
    //comprueba si la lista está vacia , sino retona
    fun isEmpty(): Int? {
        if (lista.isEmpty()){
            return null
        }else{
            return lista.size
        }
    }

}