import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();
        int t = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();
        int m = scan.nextInt();
        int n = scan.nextInt();
        
        int appleCount = 0;
        int orangeCount = 0;
        
        int[] apple = new int[m];
        for(int i=0; i < m; i++){
            apple[i] = scan.nextInt();
            
            int appleDropPosition = apple[i] + a;
            
            if(s <= appleDropPosition && appleDropPosition <= t){
                appleCount++;
            }
        }
        
        int[] orange = new int[n];
        for(int j=0; j < n; j++){
            orange[j] = scan.nextInt();
            
            int orangeDropPosition = orange[j] + b;
            
            if(s <= orangeDropPosition && orangeDropPosition <= t){
                orangeCount++;
            }
        }
        
        System.out.println(appleCount);
        System.out.print(orangeCount);
        scan.close();
    }
}
