fun main() {

    for (i in 1..100 step 2) {
        when {
            i < 50 -> println("numbers below 50: $i")
            else -> println("number above 50: $i")
        }
    }
}
