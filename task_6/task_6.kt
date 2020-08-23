package latihandArkademy

// Buatlah fungsi untuk menghitung Luas Lingkaran dengan parameter berupa nilai jari-jari.

fun main() {
    val result: Double = luasLingkaran(10)
    println("Luas lingkaran: $result")
}

var luasLingkaran= { jari: Int -> 3.14*(jari*jari) }