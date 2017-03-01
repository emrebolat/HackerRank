import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
       Scanner scan = new Scanner(System.in);
       StringBuilder sb = new StringBuilder(scan.nextLine());
            
        for(int i = 1; i < sb.length(); i++) {
            if(sb.charAt(i) == sb.charAt(i-1)) {
                sb.delete(i-1, i+1);
                i = 0;
            }
        }
        
        if(sb.length() == 0){
            System.out.println("Empty String");
        }
        else{
            System.out.println(sb);
        }
        
        scan.close();
    }
}