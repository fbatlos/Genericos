class Pila<T>{
    val lista:MutableList<T> = mutableListOf()
    fun push(nuevo:T){
        lista.add(nuevo)
    }

    fun top():T?{
        if (lista.isEmpty()){
            return null
        }
        return lista[lista.size - 1]
    }

    fun pop():T?{
        if (lista.isEmpty()){
            return null
        }
        return lista.removeLast()
    }

    fun isEmpty():T?{
        if (lista.isEmpty()){
            return null
        }else{
            return error("")
        }
    }

}