import java.util.*
import java.io.*

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (n,m) = br.readLine().split(" ").map{it.toInt()}
    val arr = Array(n){IntArray(m)}
    var index =0
    repeat(n){
        arr[index++]=br.readLine().map{it.toString().toInt()}.toIntArray()
    }
    dfs(arr,n,m)
}


fun dfs(arr:Array<IntArray> ,n:Int,m:Int){
    val q = ArrayDeque<Triple<Int,Int,Int>>()
    val isVisited = Array(n){BooleanArray(m)}
    var mininum = Int.MAX_VALUE
    q.addLast(Triple(0,0,1))
    while(q.isNotEmpty()){
        val v = q.removeFirst()
        if(isVisited[v.first][v.second]|| arr[v.first][v.second]==0){
           continue 
        }else{
            isVisited[v.first][v.second] = true
        }
        if(v.first == n-1 && v.second == m-1){
            if(mininum>v.third) mininum = v.third
        }

        if(v.first+1<=n-1){
            q.addLast(Triple(v.first+1,v.second,v.third+1))
        }
        if(v.first-1>=0){
            q.addLast(Triple(v.first-1,v.second,v.third+1))
        }
        if(v.second+1<=m-1){
            q.addLast(Triple(v.first,v.second+1,v.third+1))
        }
        if(v.second-1>=0){
            q.addLast(Triple(v.first,v.second-1,v.third+1))
        }
    }
    print(mininum)

}
