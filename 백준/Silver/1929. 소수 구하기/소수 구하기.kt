import java.io.*
import java.util.*

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val MAX_COUNT = 1000000
    val arr = BooleanArray(MAX_COUNT + 1) {true}

    arr[1] = false

    for(i in 2..MAX_COUNT){
        for(j in 2*i..MAX_COUNT step i){
            arr[j] = false
        }
    }

    val inputArr = br.readLine().split(" ").map{it.toInt()}
    val num1 = inputArr[0]
    val num2 = inputArr[1]
 

    for(num in num1..num2){
        if(arr[num]){
            bw.write("$num\n")
        }
    }
    
    bw.flush()
    bw.close()
}