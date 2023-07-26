fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}

open class Arac(){
   open val Arac_hizi:Int=0
   open var Yakit="yakit"



}
class Otomobil:Arac(){
    override val Arac_hizi: Int=150

    override var Yakit: String="Dizel"
    var bagajHacmiLt:Int=600
    fun bagaj(){
        println("Bagaj Açıldı")
    }
}
