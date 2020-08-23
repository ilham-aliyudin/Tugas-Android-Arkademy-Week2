package latihandArkademy

// Buat program yang menghitung rata-rata UN beserta gradenya, dengan mengisi 4 nilai yakni Bahasa indonesia, Bahasa Inggris Matematika dan IPA, yang di dalam program tersebut memiliki validasi yaitu semua nilai tersebut harus diisi dan juga untuk grade memiliki kondisi dengan ketentuan sebagai berikut:
// 90 - 100 = A
// 80 - 89 = B
// 70 - 79 = C
// 60 - 69 = D
// 0 - 59 = E

fun main() {

    try {
        print("Masukkan Nilai MTK: ")
        val mtk = readLine()!!.toInt()
        print("Masukaan Nilai B.Indo: ")
        val indo = readLine()!!.toInt()
        print("Masukaan Nilai Ipa: ")
        val ipa = readLine()!!.toInt()
        print("Masukaan Nilai Inggris: ")
        val inggris = readLine()!!.toInt()

//      Hasil
        val result = listOf(mtk, indo, ipa, inggris).average()
        println("Nilai rata-rata: $result")
        when (result.toInt()) {
            in 90..100 -> println("Grade A")
            in 80..89 -> println("Grade B")
            in 70..79 -> println("Grade C")
            in 60..69 -> println("Grade D")
            in 0..59 -> println("Grade E")
        }
    } catch (e: Exception) {
        println("Nilai Tidak Boleh Kosong / Huruf")
    }
}
