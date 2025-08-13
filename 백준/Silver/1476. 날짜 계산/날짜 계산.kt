import java.io.*
import java.util.*

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))


    val arr = br.readLine().split(" ").map{it.toInt()}.toMutableList()


    arr[1] = (arr[1]-arr[0]+28) % 28
    arr[2] = (arr[2]-arr[0]+19) % 19

    var i = 0;
    while(true){
        if( i%28 ==arr[1] && i%19 == arr[2]){
            break
        }
        i += 15
    }
    
    bw.write("${arr[0]+i}")
    
    bw.flush()
    bw.close()
}

