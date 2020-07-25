import java.util.Scanner
import kotlin.math.max
import kotlin.math.min
import java.util.Arrays

fun main(args : Array<String>){
    var a : Long = 0
    var b : Long = 0
    var c : Long = 0
    val reader = Scanner(System.`in`)
    var tc = reader.nextInt();

    while (tc>0){
        var x = reader.nextLong()
        var y = reader.nextLong()

        var ab : Long = max(x,y)
        var ac : Long = min(x,y)

        for (i in ab+1 until ab+ac+1){
            var abc = i
            b = abc-ac
            a = ab-b
            c = ac - a

            if(a+b == ab && a+c == ac){
                break
            }
        }
        println("$a $b $c")
        tc--
    }
}
