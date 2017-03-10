import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arr[][] = new int[6][6];
        int hourglass = 0;
        int max = Integer.MIN_VALUE; // negative case
        
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = scan.nextInt();
            }
        }
        
        for(int k=0; k < 4; k++){
            for(int l=0; l < 4; l++){
                hourglass = arr[k][l] + arr[k][l+1] + arr[k][l+2] 
                          + arr[k+1][l+1] 
                          + arr[k+2][l] + arr[k+2][l+1] + arr[k+2][l+2];
                
                if (hourglass > max) {
        			max = hourglass;
        		}
            }
        }
        
        System.out.println(max);
        scan.close();
    }
}