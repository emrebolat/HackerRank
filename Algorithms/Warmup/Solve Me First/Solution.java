import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
   
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b;
        a = scan.nextInt();
        b = scan.nextInt();
        
        int sum;
        sum = solveMeFirst(a, b);
        
        System.out.println(sum);
	scan.close();
   }
    
    static int solveMeFirst(int a, int b) {
        return a + b;
    }
}
