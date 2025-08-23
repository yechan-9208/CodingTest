import java.io.*
import java.util.*


fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))

    val (n,m) = br.readLine().split(" ").map{it.toInt()}

    val list = MutableList(n+1){mutableListOf<Int>()}

    repeat(m){
        val (input1,input2) = br.readLine().split(" ").map{it.toInt()}
        list[input1].add(input2)
        list[input2].add(input1)
    }
    
    val isVisited = MutableList(n+1){false}
    var result = 0
    var isEnd = false
    var start = 1
    while(!isEnd){
        result++
        bfs(list,isVisited,start)
        
        isEnd = true
        for(i in 1..n){
            if(!isVisited[i]){
                start = i
                isEnd = false
                break
            }
        }
    }
    print(result)
}


fun bfs(list:MutableList<MutableList<Int>>, isVisited:MutableList<Boolean>,start:Int ){
    val q : ArrayDeque<Int>  = ArrayDeque()
    q.add(start)
    isVisited[start] = true

    while(q.isNotEmpty()){
        val node = q.removeFirst()
        for(next in list[node]){
            if(!isVisited[next]){
                isVisited[next] = true
                q.add(next)
            }
        }
    }
}

