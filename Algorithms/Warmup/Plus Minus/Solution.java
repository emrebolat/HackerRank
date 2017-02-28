import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        final int N = Integer.parseInt(scan.nextLine());
        double negativeCount=0.0, positiveCount=0.0, zeroCount=0.0;
        
        for(int i = 0; i < N; i++){
            int num = scan.nextInt();
            if(num < 0){
                negativeCount++;
            }
            else if(num > 0){
                positiveCount++;
            }
            else{
                zeroCount++;
            }
        }
        
        System.out.println(positiveCount/N);
        System.out.println(negativeCount/N);
        System.out.println(zeroCount/N);
        scan.close();
    }
}