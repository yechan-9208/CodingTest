import java.io.*
import java.util.*

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var arr1 = mutableListOf<Int>()
    var arr2 = mutableListOf<Int>()
    
    repeat(9){
        val input =br.readLine().toInt()
        arr1.add(input)    
    }

    sum100(arr1,arr2,0)
    arr2.sort()
    
    for(i in 0..arr2.size-1){
        bw.write("${arr2[i]}\n")
    }
    
    bw.flush()
    bw.close()
}


fun sum100(arr1: List<Int>, arr2: MutableList<Int>, i: Int): MutableList<Int>? {
    if (arr2.size == 7) {
        if (arr2.sum() == 100) return arr2.toMutableList() 
        else return null
    }

    if (i >= arr1.size) return null

    arr2.add(arr1[i])
    val result = sum100(arr1,arr2,i+1)
    if(result != null) return result

    arr2.removeAt(arr2.lastIndex)
    return sum100(arr1, arr2, i + 1)
}