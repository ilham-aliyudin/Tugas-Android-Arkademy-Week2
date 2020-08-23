package latihandArkademy

// Buatlah sebuah fungsi untuk menghitung usia yang menerima parameter berupa tahun lahir. Contoh: checkAge(1945), output: 75

fun main() {
    val result = checkAge(1995)
    println("Umurmu: $result")
}

val checkAge = { year: Int -> 2020 - year}