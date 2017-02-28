import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        final int n = scan.nextInt();
        long sum = 0;
        
        for(long i = 0; i < n; i++){
            sum += scan.nextInt();
        }
        
        System.out.println(sum);
        scan.close();
    }
}