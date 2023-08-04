import kotlin.concurrent.thread

fun Gorev1() {
    println("Birinci görev başladı")
    Thread.sleep(5000)
    println("Birinci görev bitti")
}

fun Gorev2() {
    println("İkinci görev başladı")
    Thread.sleep(3000)
    println("İkinci görev bitti")
}

fun main() {

    val thread1 = thread { Gorev1() }
    val thread2 = thread { Gorev2() }


    println("Diğer görevler bekleniyor")
    Thread.sleep(6000)

    // Ana thread'in devam ettiği bilgisini yazdır
    println("Bütün görevler bitti")
}