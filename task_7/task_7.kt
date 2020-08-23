package latihandArkademy

// Buatlah sebuah fungsi yang menerima parameter sebuah tahun, kemudian diperiksa apakah tahun tersebut merupakan tahun kabisat.

fun main() {
    print("Masukkan Tahun: ")
    val year = readLine()!!.toInt()

    if (year % 4 == 0) {
        if (year % 100 == 0) {
            if (year % 400 == 0) {
                println("Tahun Kabisat")
            } else {
                println("Bukan Kabisat")
            }
        } else {
            println("Tahun Kabisat")
        }
    } else {
        println("Bukan Tahun Kabisat")
    }
}


