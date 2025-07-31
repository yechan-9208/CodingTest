fun main() {
    var input_count  =readLine()!!.toInt()
    var result = 0

    while(input_count-- >0){
        var input  =readLine()!!
        var map1 = mutableMapOf<Char,Int>()
        var temp = input[0]
        for(i in input){
            if(i in map1.keys && temp != i){
                map1[i] =-1
            }

            if(i !in map1.keys){
                map1[i] = 0
            }
            temp = i
        }

        val check =map1.all{(_,value)->value!=-1}
        if(check){
            result++
        }
    }
  
    print(result)
}