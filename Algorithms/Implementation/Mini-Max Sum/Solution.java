import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long a = scan.nextLong();
        long b = scan.nextLong();
        long c = scan.nextLong();
        long d = scan.nextLong();
        long e = scan.nextLong();
        
        long[] array = {a,b,c,d,e};
        Arrays.sort(array);
        
        long min = 0;
        long max = 0;
        
        for(int i = 0; i < 4; i++){
            min += array[i];
            max += array[i+1];
        }
        
        System.out.print(min + " " + max);
        scan.close();
    }
}
