package latihandArkademy

// Buatlah sebuah fungsi untuk memeriksa angka tersebut ganjil atau genap. Contoh; input: 5 output: the number is odd
// input: 8 output: the number is even

fun main() {
    println(oddEven(299))
}

val oddEven = { num: Int -> if (num % 2 == 0) "Genap" else "Ganjil" }