class Solution {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        var answer = mutableListOf<Int>()
        for(command in commands){
            var newArr = mutableListOf<Int>()
            array.forEachIndexed{ i,v ->
                if(command.get(0)<=i+1 && i+1<=command.get(1)){
                    newArr.add(v)
                }
            }
            newArr.sort()
            answer.add(newArr.get(command.get(2)-1))
        }
        return answer.toIntArray()
    }
}