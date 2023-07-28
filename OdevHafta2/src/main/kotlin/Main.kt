import kotlin.random.Random

fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}
class Personel(var ad:String,var Soyad:String,var Pozisyon:String,var Maas:Int){
    fun maasArttir(){
        println("Maaş artış miktarı giriniz")
        var x:Int= readln().toInt()
        Maas+=x
        println("yeni maas $Maas")
    }
}
open class Oyuncu(){
    open fun oyna(){
        println("Ne oynayayım?")
    }
}

class Basketbolcu():Oyuncu(){
    override fun oyna(){
        println("Basketbol oynuyorum")
    }
    fun BasketAt(){
        var x:Int= Random.nextInt(1,3)
        when(x){
            1-> println("Bir sayılık basket")
            2-> println("İki sayılık basket")
            3-> println("Üç sayılık basket")
        }

    }
}
class Futbolcu():Oyuncu(){
    override fun oyna(){
        println("Futbol Oynuyorum")
    }
    fun CalimAt(){
        println("rakip bakkala yollandı")
    }
}
class Kullanici(){
    //soru5 ve 6
    var Ad:String?=null
    var Soyad:String?=null
    /*null reference exception hatası çalışma zamanında ortaya çıkarlar ve farkedilmedikleri için büyük zarara yol açarlar milyar  dolarlık hata da denir.
    Kotlinin diğer dillerden farklı olarak safe calls? ve Null Check Operatörleri!! vardır
    "?" operatörü bir nesnenin null olup olmadığını kontrol ederken "!!" operatörü bir nesnenin null olmamasını garanti eder.
     Bu sayede, null referans hataları  engellenir.
     */
}