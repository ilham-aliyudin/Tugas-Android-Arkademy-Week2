package latihandArkademy

fun main() {

    val teks = "sayang"
    val teksKapital = teks.toUpperCase()
    val teksTerbalik = teksKapital.reversed()
    val result = if (teksKapital == teksTerbalik ) "Palindrome" else "Bukan Palindrome"
    println(result)


/*
    // Mulai looping
    while (x >= 0) {
        teksTerbalik += teksKapital[x]
        x -= 1
    }

    // Masuk ke perbandingan
    if (teksTerbalik == teksKapital) {
        print("Palindrome")
    } else {
        println("Bukan Palindrome")
    }
*/

}