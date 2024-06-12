class Solution {
    public int[] solution(int[] arr, int n) {
        for(int i=0;i<arr.length;i++){
            arr[i]+=(arr.length%2+i)%2*n;
        }
        return arr;
    }
}