package odev1

fun main(){

    print("KULLANICI ADINIZI GİRİNİZ \n")
    var name= readLine().toString()

    println("ŞİFRENİZİ GİRİNİZ")
    var password= readLine()
    val registeredName="ahmet"
    val registeredPassword= "cokGuvenLiSifre1234"
    var deger:Int?=null


    if(name.equals(registeredName,ignoreCase = true)&&password.equals(registeredPassword,ignoreCase = false))
        println("HOŞGELDİNİZ")
    else
        println("KULLANICI ADI VEYA ŞİFRE HATALI!")

}