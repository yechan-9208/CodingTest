class Solution {
    fun solution(wallpaper: Array<String>): IntArray {
        
        var x : Int
        var y : Int
        
        var arrX : MutableList<Int> = mutableListOf()
        var arrY : MutableList<Int> = mutableListOf()
        
        for(x in 0 until wallpaper.size){
            for(y in 0 until wallpaper[x].length){
                if(wallpaper[x][y]=='#'){
                    arrX.add(x)
                    arrY.add(y)
                }       
            }
        }

        arrX.sort()
        arrY.sort()
        
        return intArrayOf(arrX.first(),arrY.first(),arrX.last()+1,arrY.last()+1)
    }
}