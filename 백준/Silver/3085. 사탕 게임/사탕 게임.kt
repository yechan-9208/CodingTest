import java.io.*
import java.util.*

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))


    val inputCount = br.readLine().toInt()


    val arr2D = MutableList(inputCount) { MutableList(inputCount){' '}}

    for(i in 0 until inputCount){
        val input = br.readLine().toMutableList()
        for(j in 0 until inputCount){
            arr2D[i][j] = input[j]
        }
    }

    var max =0

    for (i in 0 until inputCount - 1) {      
        for (j in 0 until inputCount) {    
            val col = swapAndCheckMax(arr2D, i, j, true)
            if (max < col) max = col
        }
    }
    
    for (i in 0 until inputCount) {         
        for (j in 0 until inputCount - 1) { 
            val row = swapAndCheckMax(arr2D, i, j, false)
            if (max < row) max = row
        }
    }
    bw.write("$max")

    bw.flush()
    bw.close()
}

fun swapAndCheckMax(arr2D:MutableList<MutableList<Char>>,rowIdx:Int,column:Int,isRow:Boolean):Int{
    val newArr2D = arr2D.map { it.toMutableList() }.toMutableList() 
    val temp = newArr2D[rowIdx][column]
    if(isRow){
        newArr2D[rowIdx][column] =  newArr2D[rowIdx+1][column]
        newArr2D[rowIdx+1][column] = temp
    }else{
        newArr2D[rowIdx][column] =  newArr2D[rowIdx][column+1]
        newArr2D[rowIdx][column+1] = temp
    }
    return checkMax(newArr2D)
}

fun checkMax(arr2D:MutableList<MutableList<Char>>):Int{
    var max = 0

    for(row in arr2D){
        val rowMax = findMax(row)
        if(max<rowMax) max = rowMax
    }
    
    for(i in 0 until arr2D.size){
        val col = arr2D.map{it[i]}.toMutableList()
        val colMax = findMax(col)
        if(max<colMax) max = colMax
    }

    return max
}

fun findMax(arr:MutableList<Char>):Int{
    var max = 0
    var count = 0
    var pre:Char? = null
    for(c in arr){
        if(c == pre){
            count++
        }else {
            count = 1
            pre = c
        }
        if(max<count) max = count
    }
    
    return max
}