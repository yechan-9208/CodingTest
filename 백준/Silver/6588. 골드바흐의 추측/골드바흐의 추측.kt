fun main() {
    val MAXIMUM = 1000000
    var arr = Array(MAXIMUM+1){true}
    
    for(i in 2..MAXIMUM){
        for(j in 2*i..MAXIMUM step i){
            arr[j]=false
        }
    }
        
    while(true){
       val input = readLine()!!.toInt()
       if(input==0) break
        
       var result = false
        
       for(i in 3..input/2 step 2){
            val diff = input-i
            if(arr[i]&&arr[diff]){
                println("$input = $i + $diff")
                result = true
                break
            }
        }    
        
        if(!result){
            println("Goldbach's conjecture is wrong.")
        }
    }
}