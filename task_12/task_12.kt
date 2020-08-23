package latihandArkademy

fun main() {

    print("Masukkan 2 kata/lebih : ")
    val word = readLine()!!.toString()
    val wordList: List<String> = word.split(" ")
    val x: Int = wordList.size - 1

    if(x == 0) {
        println("Harus 2 kata atau lebih" )
    } else {
        val result = wordList
                .reversed()
                .joinToString(" ")
        println(result)
    }
}
