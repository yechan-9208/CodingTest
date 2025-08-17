import java.io.*
import kotlin.math.abs
import kotlin.math.min

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var targetC = br.readLine().toInt()
  
    var brokenBtnCount = br.readLine().toInt()

    var btnArr = mutableListOf<Int>()

    for(i in 0 .. 9){
        btnArr.add(i)
    }

    if(brokenBtnCount>0){
        var brokenBtnArr = br.readLine().split(" ").map{it.toInt()}
        for(i in brokenBtnArr){
            btnArr.remove(i)
        }
    }

    var min = abs(targetC-100)

    for(i in 0..999999){    
        if(isCanMake(btnArr,i)) {
            val diff = abs(targetC-i)+i.toString().length
            if(diff<min){
                min = diff
            }
        }
    }

    bw.write("$min")
    
    bw.flush()
    bw.close()
}

fun isCanMake(btnArr:MutableList<Int>, num:Int):Boolean{
    var number = num

    if(number==0 && number !in btnArr) return false
    
    while(number>0){
        if(number%10 in btnArr){
            number = number/10
        }else{
            return false
        }
    }
    return true
}