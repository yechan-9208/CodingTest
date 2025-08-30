import java.util.*
import java.io.*

val MAX_VALUE = 100000

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (n,k)= br.readLine().split(" ").map{it.toInt()}
    dfs(n,k)
}

fun dfs(current:Int,target:Int){
    val q : ArrayDeque<Pair<Int,Int>> = ArrayDeque()
    var isVisited = BooleanArray(MAX_VALUE+1){false}
    q.addLast(Pair(current,0))
    while(q.isNotEmpty()){
        val (position, count) = q.removeFirst()

        if(position<0 || position>100000 || isVisited[position]) continue
    
        isVisited[position] = true

        if(position == target){
            print(count)
            return
        }

        q.addLast(Pair(position-1,count+1))
        q.addLast(Pair(position+1,count+1))
        q.addLast(Pair(position*2,count+1))
    }

}