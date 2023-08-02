

import java.util.HashMap
import java.util.HashSet


fun main(args: Array<String>) {
    println("Hello World!")
    var l= listOf<Int>(1,2,3,4,4,4,5,5,6,7)
    var a= arrayListOf<Int>(1,2,4,4,4,5,7)
    var s= hashMapOf(1 to 4,2 to 5,4 to 7)
    Soru13(s)
    var ornek = mutableListOf<String>("elma,armut,kel, mahmut")
    println(Soru11(a))
    println("Program arguments: ${args.joinToString()}")
}
//Soru1
fun Soru1(liste:List<Int>){
    var top:Int=0
    for (i in liste) {
        top += i
    }
    println(top)
}
//Soru2
fun Soru2(liste:List<Int>):List<Int>{
    var yeniListe= mutableListOf<Int>()
    for (i in liste){
        if(i%2==0){
            yeniListe.add(i)
        }
    }
    return yeniListe
}
//Soru3
fun Soru3(liste1:MutableList<Int>,liste2:MutableList<Int>):List<Int>{
    var yeniListe= mutableListOf<Int>()
    yeniListe=liste1.toMutableList()
    yeniListe=liste2.toMutableList()
    var temp:Int
    for (i in 0..yeniListe.size-1){
        for (j in 0..yeniListe.size)
            if (j<i){
                temp=j
                yeniListe[j]=yeniListe[i]
                yeniListe[i]=temp

            }
    }
    return yeniListe
}
//Soru4
fun Soru4(liste:MutableList<String>):String{
    var sonListe=StringBuilder()
    for (i in liste){

    sonListe.append(i)
    }

    return sonListe.reversed().toString()
}
//Soru5
fun Soru5(liste:List<Int>):HashSet<Int>{
    var hashSet=HashSet<Int>()
    for (i in 0..liste.size-1){
        for (j in 0..liste.size-1){
            if (liste[i]==liste[j]){
                hashSet.add(liste[i])
            }
        }
    }
    return hashSet
}
//Soru6
fun Soru6(hashSet: HashSet<Int>){
    var aranan:Int= readln().toInt()
    for (i in hashSet){
        if (i==aranan)
            println("$i bu eleman listede var")
    }
}
//Soru7
fun Soru7(hashSet: HashSet<Int>):HashSet<Int>{
    var sonSet:HashSet<Int>
    sonSet=hashSet.toHashSet()
    return sonSet
}
//Soru8
fun Soru8(liste:List<Int>):Set<Int>{
   var a= setOf(*liste.toTypedArray())
    return a
}
//Soru9
fun Soru9(set1:Set<Int>,set2:Set<Int>):List<Int>{
    var l1=set1.toMutableList()
    val l2=set2.toList()
    for (i in l1){
        for(j in l2)
            if (i==j)
                l1.remove(i)

    }
    return l1
}
//Soru10
fun <K, V> Soru10(h1: HashMap<K, V>, h2: HashMap<K, V>): HashMap<K, V> {
    val hSon = hashMapOf<K, V>()
    for ((key, value) in h1) {
        if (h2.containsKey(key) && h2[key] == value) {
            hSon[key] = value
        }
    }
    return hSon
}
//Soru11
/*
fun Soru11(liste:ArrayList<Int>):HashMap<Int,Int>{
    val hmap = HashMap<Int, Int>()
    var adetlist= mutableListOf<Int>()
    var tmp=0
    for(i in liste) {
        for (j in liste) {
            if (i != j) {
                if (adetlist[i] == adetlist[j]) {
                    adetlist[i] = tmp + 1
                }
            }
            hmap.put(i, tmp)
        }

    }
    return hmap
}*/
fun Soru12(h:HashMap<String,Int>):Int{
    var top:Int=0
    for(i in h){
        top+=i.value
    }
    return top
}
fun Soru13(h:HashMap<Int,Int>){
    var hSonn:HashMap<Int,Int>
    var enBuyuk=0
    var anahtar=0
    for (i in h){
        if (i.value>=enBuyuk){
            enBuyuk=i.value
            anahtar=i.key
        }
    }
    println(anahtar)
    println(enBuyuk)

}


