package latihandArkademy

// Buat dua variabel x=10, y=20 Kemudian tukarkan isi variabel tersebut menjadi output x=20, y=10. Dengan syarat tanpa menambahkan variabel baru (Clue: gunakan math operation).

fun main() {
    var x = 40
    var y = 20
    x -= y
    y += x
    x = y - x
    println("x : $x dan y : $y")
}