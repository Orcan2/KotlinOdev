fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}
fun SayilariTopla():Int{
    val arrayList = ArrayList<Int>()
    var sonuc:Int=0
    var index:Int=0
    for(i in 1..5){
        index= readln().toInt()
       arrayList.add(index)
        sonuc+=index
    }
    return sonuc
}