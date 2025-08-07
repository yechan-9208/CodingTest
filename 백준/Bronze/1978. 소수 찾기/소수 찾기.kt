import java.io.*
import java.util.*

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val inputFirst = br.readLine().toInt()
    val inputSecond = br.readLine().split(" ").map{it.toInt()}

    var result = 0
    for(num in inputSecond){
        for(i in 2..num){
            if(i==num) result++
            if(num%i==0) break
        }   
        
    }

    bw.write("$result")
    bw.flush()
    bw.close()
}


