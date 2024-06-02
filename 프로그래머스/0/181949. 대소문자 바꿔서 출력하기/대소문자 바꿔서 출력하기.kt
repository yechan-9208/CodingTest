fun main(args: Array<String>) {
    val s1 = readLine()!!
    var s2=StringBuilder()
    for(c in s1){
        if(c.isUpperCase()){
            s2.append(c.toLowerCase())
        }else{
            s2.append(c.toUpperCase())
        }
    }
    print(s2.toString())
}