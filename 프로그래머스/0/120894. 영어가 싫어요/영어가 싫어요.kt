class Solution {
    fun solution(numbers: String): Long {
        var answer: Long = 0
        var number = ""

        for (c in numbers) {
            number += c

            when (number) {
                "zero"->{
                    answer = answer * 10
                    number = ""
                }
                "one" -> {
                    answer = answer * 10 + 1
                    number = ""
                }
                "two" -> {
                    answer = answer * 10 + 2
                    number = ""
                }
                "three" -> {
                    answer = answer * 10 + 3
                    number = ""
                }
                "four" -> {
                    answer = answer * 10 + 4
                    number = ""
                }
                "five" -> {
                    answer = answer * 10 + 5
                    number = ""
                }
                "six" -> {
                    answer = answer * 10 + 6
                    number = ""
                }
                "seven" -> {
                    answer = answer * 10 + 7
                    number = ""
                }
                "eight" -> {
                    answer = answer * 10 + 8
                    number = ""
                }
                "nine" -> {
                    answer = answer * 10 + 9
                    number = ""
                }
            }
        }

        return answer
    }
}