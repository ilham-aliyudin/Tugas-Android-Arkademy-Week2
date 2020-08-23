package latihandArkademy

// Buatlah program yang memiliki satu variabel dengan nama “printSegitiga” yg berisi tipe data number yang menghasilkan output segitiga terbalik yang berisi angka
fun main() {
    print("Masukkan baris: ")
    val baris: Int = readLine()!!.toInt()

    for (i in baris downTo 1) {
        for (j in 1 .. i) {
            print("$j ")
        }
        println()
    }
/*
    for (i in 1..baris) {
        for (j in 1..i ) {
            print("* ")
        }
        println()
    }
 */
}