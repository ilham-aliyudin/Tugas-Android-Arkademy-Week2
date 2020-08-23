package latihandArkademy

// Diberikan sebuah variabel yang berisikan bilangan integer dengan ketentuan angka 0 (nol) dalam variabel tersebut merupakan pemisah antara satu bilangan dengan bilangan lainnya. Bilangan-bilangan tersebut akan dipisah dan diurutkan berdasarkan angka di bilangan-bilangan itu sendiri. Setelah itu, bilangan hasil pengurutan akan digabung kembali dengan tanpa pemisah dengan output berupa bilangan integer. Buatlah function yang menerima parameter hanya deret angka dan menghasilkan output seperti keterangan di atas.

fun main() {
    dividedAndSort(5956560159466056)
}

val dividedAndSort = { num: Long ->
    val numToString = num.toString()
    val splitedNum = numToString.split("0")

    for (i in splitedNum.indices) {
        val result = splitedNum[i]
                .toList()
                .sorted()
                .joinToString("")
        print(result)
    }
}