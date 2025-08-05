fun main(){
    val inputArr = readLine()!!.split(" ").map{it.toInt()}
    val num1Set = divisor(inputArr[0])
    val num2Set = divisor(inputArr[1])

    val result1 =  num1Set.filter{it in num2Set}.max()
    var result2 = inputArr[0] * inputArr[1] / result1
    println(result1)
    println(result2)
}

fun divisor(num:Int):MutableSet<Int>{
    var arr = mutableSetOf<Int>()
    for(i in 1..num){
        if(num%i==0){
            arr.add(i)
            arr.add(num/i)
        }
    }
    return arr
}