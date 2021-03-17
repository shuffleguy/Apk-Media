package ne.digitalinoovation.collections

fun main(){
    val nomes = Array(3){""}
//array de string precisa dessa estrutura
    nomes[0] = "Maria"
    nomes[1] = "Joao"
    nomes[2] = "Jose"

    println("-------------------------------")
    for (nome in nomes){

        println(nome)
    }

    nomes.sort()
    nomes.forEach { println(it) }

    println("-------------------------------")
    //segunda maneira de declarar array

    val nomes2 = arrayOf("Maria", "Zazá", "Pedro")

    nomes2.sort()
    nomes2.forEach { println(it) }
}