import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        
        String result_cal="";
        
        
        if(n%2==0){
            result_cal="even";
        }else{
            result_cal="odd";
        }
        
        System.out.printf("%d is %s",n,result_cal);
        
    }
}