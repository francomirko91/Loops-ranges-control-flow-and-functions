fun main() {

    for (i in 1..100 step 2) {
        when {
            i < 50 -> println("before 50 $i")
            else -> println("after 50 $i")
        }
    }
}
