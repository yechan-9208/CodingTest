fun main(){
    val input1 = readLine()
    var input2_arr = readLine()!!.split(" ").map{it.toInt()}.sorted()
    
    val first_num = input2_arr[0]
    val last_num = input2_arr[input2_arr.size-1]
    
    print(first_num*last_num)
}