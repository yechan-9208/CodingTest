fun main() {
    val s = readLine()!!
    var i = readLine()!!.toInt()
    for(c in s){
        if(--i==0){
            print(c)
            break
        }
    }
} 