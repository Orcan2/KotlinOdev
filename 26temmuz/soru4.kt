fun main(args: Array<String>) {
    println("Hello World!")

    SayilariTopla()
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