import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Object[] heights = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).toArray();
        
        String word = scan.nextLine();
        int maxHeight = 0;
        
        for(int i = 0; i < word.length(); i++) {
            int charIndex = word.charAt(i) - 'a';
            int height = (int) heights[charIndex];
            if(height > maxHeight) {
                maxHeight = height;
            }
        }

        long square = word.length() * maxHeight;
        System.out.println(square);
        scan.close();
    }
}
