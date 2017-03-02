import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {

        int upperCase = 0;
        Scanner scan = new Scanner(System.in);
        String s = scan.next();

        for(int i=0; i< s.length();i++){
           if(Character.isUpperCase(s.charAt(i))){
               upperCase++;
           }
        }

        System.out.print(upperCase + 1);
        scan.close();
    }
}
