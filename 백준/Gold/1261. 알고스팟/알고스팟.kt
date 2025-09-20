import java.util.*
import java.io.*

fun main(){
    val (m,n) = readLine()!!.split(" ").map{it.toInt()}

    val arr = Array(n){IntArray(m)}

    var index =0
    repeat(n){
        arr[index++] = readLine()!!.map{it.toString().toInt()}.toIntArray()
    }


    val x = arrayOf(1,0,-1,0)
    val y = arrayOf(0,1,0,-1)

    val start = Triple(0,0,0)
    print(bfs(x,y,start,arr))
}


fun bfs(x:Array<Int>,y:Array<Int>,start:Triple<Int,Int,Int>,arr:Array<IntArray>): Int{
    val q = ArrayDeque<Triple<Int,Int,Int>>()
    var mininum = Int.MAX_VALUE
    val n = arr.size 
    val m = arr[0].size
    val isCheck = Array(n){IntArray(m){Int.MAX_VALUE}}

    q.add(start)

    while(q.isNotEmpty()){
        val current=q.removeFirst()

        val wallCount = current.third + arr[current.second][current.first]
        
        if(isCheck[current.second][current.first]<=wallCount){
            continue
        }else{
            isCheck[current.second][current.first]=wallCount
        }

        
        
        for(i in 0..3){
            val nextX = current.first+x[i]
            val nextY = current.second+y[i]

            if(nextX>=0 && nextY>=0 && nextX<m && nextY<n) q.addLast(Triple(nextX,nextY,wallCount))
        }

        if(current.first == m-1 && current.second == n-1 && mininum>wallCount) mininum = wallCount
        
    }
    return mininum
}