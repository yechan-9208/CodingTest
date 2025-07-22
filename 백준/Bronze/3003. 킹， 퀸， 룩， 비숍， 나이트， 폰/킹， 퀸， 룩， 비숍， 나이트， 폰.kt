fun main() {
    val input  =readLine()!!
    val split_input = input.split(" ").map{it.toInt()}
    val list = mutableListOf(1,1,2,2,2,8)
    var result =""

    for(i in 0..list.size-1){
        result += "${list[i]-split_input[i]} "
    }
    
    println(result)
}