
fun main() {
    while(true){
        var inputLine = readLine() ?: break
        var input = inputLine.toInt()

        var count = 0L
        var reminder = 0L
        while(true){
            count++
            reminder = (reminder*10+1)% input
            if(reminder == 0L) break
        }
        println(count)
    }
}