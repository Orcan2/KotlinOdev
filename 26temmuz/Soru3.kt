fun main(args: Array<String>) {
    println("Hello World!")
    println(sesliKaldir("Elma armut"))

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}
fun sesliKaldir( kelime:String):String{
    val sesli = listOf( 'A', 'E', 'I', 'O', 'U','a', 'e', 'i', 'o', 'u')
    var sonuc:String=""

    for (char in kelime) {
        if (!sesli.contains(char)) {
        sonuc+=char.toString()
        // sonuc.append(char)
        }
    }

    return sonuc.toString()
}