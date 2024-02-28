fun <T> Reversa(list: List<T>): List<T> {
    val listaReversa = mutableListOf<T>()
    val pila= Pila<T>()
    //convierto la list en una lista iterada
    val listaIterada=list.iterator()
    //Se recorre la lista iterada y se lo añade a pila , hasta que no haya otro parametro en la listaIterada
    while (listaIterada.hasNext()){
        pila.push(listaIterada.next())
    }
    //Mientras que la pila no este vacia , añadirá el ultimo componente de la pila y está lo borrará.
    while (pila.isEmpty() != null){
        listaReversa.add(pila.pop()!!)
    }
    return listaReversa
}