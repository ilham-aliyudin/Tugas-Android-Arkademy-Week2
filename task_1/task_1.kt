package latihandArkademy

// Buat dua variabel x=10, y=20 Kemudian tukarkan isi variabel tersebut menjadi output x=20, y=10

fun main() {
    var x = 10
    var y = 20
    val temp = x
    x = y
    y = temp
    println("x: $x, dan y: $y")
}