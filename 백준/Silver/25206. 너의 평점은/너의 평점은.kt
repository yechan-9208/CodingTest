fun main() {
    var sum = 0.0
    var count = 0.0

    val scoreMap = mapOf(
        "A+" to 4.5,
        "A0" to 4.0,
        "B+" to 3.5,
        "B0" to 3.0,
        "C+" to 2.5,
        "C0" to 2.0,
        "D+" to 1.5,
        "D0" to 1.0,
        "F" to 0.0
    )
    repeat(20){
        var input=readLine()!!.split(" ")
    
        if(input[2] in scoreMap){
            sum+=input[1].toDouble()*scoreMap[input[2]]!!
            count+=input[1].toDouble()
        }
    }

    print(String.format("%.6f", sum/count))
}