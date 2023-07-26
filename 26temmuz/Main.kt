fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}
open class GeometrikSekil {



   open fun Geometrik_seklin_ozelligi(){

    }
}
class Dikdortgen:GeometrikSekil(){
   override fun Geometrik_seklin_ozelligi(){
        var boy:Float
        var en:Float
        var alan:Float
        var cevre:Float
        println("En ve boy giriniz")
        boy = readln().toFloat()
        en= readln().toFloat()
        cevre=2*(boy+en)
        alan=boy*en
        println("Cevre $cevre , alan $alan")
    }

}
class Daire:GeometrikSekil(){
   override fun Geometrik_seklin_ozelligi(){
        var yaricap:Float
        var pi:Float=3.14f
        var alan:Float
        var cevre:Float
        println("yaricap giriniz")
        yaricap = readln().toFloat()

        cevre=2*pi*yaricap
        alan=pi*yaricap*yaricap
        println("Cevre $cevre , alan $alan")
    }
}
