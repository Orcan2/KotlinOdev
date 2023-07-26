
fun main(args: Array<String>) {
    println("Hello World!")
    var isimler = ArrayList<String>()
    isimler.add("ahmet")
    isimler.add("mehmet")
    isimler.add("ayşe")
    isimler.add("feyza")
    isimler.add("emir")
    guncelle(isimler)
    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}
fun guncelle(a:ArrayList<String>){
    var index:Int

    index= readln().toInt()
    when(index){
        1->a[0]= readln()
        2->a[1]= readln()
        3->a[2]= readln()
        4->a[3]= readln()
        5->a[4]= readln()
    }
    
    for (i in a){
        println(i)
    }


}