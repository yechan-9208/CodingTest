class Solution {
    //8시 10분시작
    fun solution(survey: Array<String>, choices: IntArray): String {
        var RT :Int = 0
        var CF :Int = 0
        var JM :Int = 0
        var AN : Int = 0
        val mid = 4
        for(i in survey.indices){
            when(survey[i]){
                "RT" -> RT+=choices[i]-mid
                "TR" -> RT-=choices[i]-mid
                "CF" -> CF+=choices[i]-mid
                "FC" -> CF-=choices[i]-mid
                "JM" -> JM+=choices[i]-mid
                "MJ" -> JM-=choices[i]-mid
                "AN" -> AN+=choices[i]-mid
                "NA" -> AN-=choices[i]-mid
            }
        }
        
        var answer: String = ""
        answer+=if(RT<=0) "R" else "T"
        answer+=if(CF<=0) "C" else "F"
        answer+=if(JM<=0) "J" else "M"
        answer+=if(AN<=0) "A" else "N"
 
        return answer
    }
}