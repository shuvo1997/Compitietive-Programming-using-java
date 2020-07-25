fun sum(a : Int, b:Int) : Int{
    return a+b
}
fun main(){
    var a = 10
    var b = 20
    val s1 = "a is $a"

    a = 20

    val s2 = "${s1.replace("is","was")}, but now is $a"
    println(s2)

    a = 1000000;
    var sum = 0
    for(i in 1..1000000){
        sum = sum+i;
    }
    println(sum)
}