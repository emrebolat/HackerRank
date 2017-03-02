import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        String result = Solution.isPangram(scan.nextLine()) ? "pangram" : "not pangram";
        System.out.println(result);
        scan.close();
    }

    protected static boolean isPangram(String input) {
        String lowerCase = input.toLowerCase();

        for (char letter = 'a'; letter <= 'z'; letter++) {
            if (lowerCase.indexOf(letter) == -1){
                return false;
            }
        }
        return true;
    }
}