import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int q = scan.nextInt();
        int[] a = new int[n];

        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = scan.nextInt();
        }

        for(int a0 = 0; a0 < q; a0++){
            int m = scan.nextInt();
            System.out.println(a[((m - k) % n + n) % n]);
        }

        scan.close();
    }
}
