import java.io.*
import java.util.*

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))

    val (n,m,v) =br.readLine().split(" ").map{it.toInt()}

    var arr = MutableList(n+1){mutableListOf<Int>()}

    repeat(m){
        var (a,b) = br.readLine().split(" ").map{it.toInt()}
        arr[a].add(b)
        arr[b].add(a)
    }

    arr.forEach{it.sort()}

    var isVisited = HashSet<Int>()
    dfs(arr,v,isVisited)
    println()
    isVisited.clear()
    bfs(arr,v,isVisited)
}

fun dfs(arr:MutableList<MutableList<Int>>,v:Int,isVisited:HashSet<Int>){
    print("$v ")
    isVisited.add(v)

    for(next in arr[v]){
        if(next !in isVisited){
            dfs(arr,next,isVisited)
        }
    }
}

fun bfs(arr:MutableList<MutableList<Int>>,v:Int,isVisited:HashSet<Int>){
    var q : Queue<Int> = LinkedList()
    q.add(v)
    isVisited.add(v)

    while(q.isNotEmpty()){
        var front = q.poll()
        for(next in arr[front]){
            if(next !in isVisited){
                q.add(next)
                isVisited.add(next)
            }
        }
        print("$front ")
    }
}