package hafta1.odev1.odev2

fun main(){
    println("YAŞINIZI GİRİNİZ")

        try {
            var age:Int = Integer.valueOf(readLine())
            if( age>=18&&age<=120)
                println("OY KULLANABİLİRSİNİZ!")
            else
                println("OY KULLANAMAZSINIZ")
        }
        catch (e:NumberFormatException){
            println("LÜTFEN GEÇERLİ BİR YAŞ GİRİNİZ")
        }



}