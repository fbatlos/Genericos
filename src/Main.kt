fun main() {
    val list=Pila<Int>()
    println(list.top())
    list.push(2)
    list.push(3)
    println(list.top())
    list.pop()
    println(list.top())
    println(list.isEmpty())

    var numbers = listOf("one", "two", "three", "four")
    var numbersRev = Reversa(numbers)
    if (listOf("four", "three", "two", "one")!=(numbersRev))
        println("Error")
    else
        println("Correcto")
    println(numbersRev)

    val numeros = listOf(1,2,3,4,5)
    val numerosReversa = Reversa(numeros)
    if (listOf(5,4,3,2,1) != numerosReversa)
        println("Error")
    else
        println("Correcto")
    println(numerosReversa)
}