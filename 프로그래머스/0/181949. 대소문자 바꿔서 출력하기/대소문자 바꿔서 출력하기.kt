fun main(args: Array<String>) {
    val s1 = readLine()!!
    for(c in s1){
        if(c.isUpperCase()){
            print(c.lowercase())    
        }else{
            print(c.uppercase())
        }
    }
}