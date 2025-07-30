fun main() {
    var input  =readLine()!!
    val list = mutableListOf("c=","c-","dz=","d-","lj","nj","s=","z=")


    for(l in list){
        input =input.replace(l,"*")
    }
    println(input.length)
}