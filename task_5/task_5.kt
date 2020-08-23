package latihandArkademy

// Buatlah fungsi untuk menghitung Luas Segitiga dengan parameter berupa alas dan tinggi.

fun main() {
    val result = luasSegitiga(70, 30)
    println("Luas segitiga: $result")

}

val luasSegitiga = { alas: Int, tinggi: Int -> 0.5*(alas*tinggi) }