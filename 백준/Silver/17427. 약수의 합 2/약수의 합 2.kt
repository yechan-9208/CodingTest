fun main(){
    val input = readLine()!!.toInt()
    var result = 0L
    for(num in 1..input){
        result += num.toLong() * (input/num)  
    }
    print(result)
}