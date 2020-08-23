package latihandArkademy

// Buatlah fungsi untuk menampilkan huruf Vokal dan Konsonan seperti dibawah ini:

fun main() {
    sortWord("Arkademy")
}

fun sortWord(word: String) {
    val convWord = word.toLowerCase()
    var vowelWord = ""
    var consoWord = ""

    for (i in convWord.indices) {
        when(convWord[i]) {
            'a', 'i', 'u', 'e', 'o' ->  vowelWord += convWord[i]
            in 'a'..'z' -> consoWord += convWord[i]
        }
    }

    val join: String = vowelWord+consoWord
    join.forEach {
        println(it.toUpperCase())
    }
}
