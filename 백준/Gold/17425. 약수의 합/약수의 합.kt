import java.io.*
import java.util.*

fun main(){
    val MAX_COUNT = 1000000
    val arr = LongArray(MAX_COUNT + 1) 

    for(i in 1 .. MAX_COUNT){
        val longN = i.toLong()
        var j = i
        while(j<=MAX_COUNT){
            arr[j]+=longN
            j+=i
        }
    }
    for(i in 1..MAX_COUNT){
        arr[i]+=arr[i-1]
    }
    
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val repeatCount = br.readLine().toInt()

    repeat(repeatCount){
        val n = br.readLine().toInt()
        bw.write("${arr[n]}\n")
    }
    bw.flush()
    bw.close()
}


