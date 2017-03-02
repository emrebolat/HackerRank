import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();

        for(int i = 0; i < T; i++){
            String odd = "";
            String even = "";

            String s = scan.next();
            int stringLength = s.length();

            for(int j = 0; j < stringLength; j++){
                if(j%2 == 0){
                    even = even + s.charAt(j);
                }
                else{
                    odd = odd + s.charAt(j);
                }
            }
            System.out.println(even + " " + odd);
        }
        scan.close();
    }
}