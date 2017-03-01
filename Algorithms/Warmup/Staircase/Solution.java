import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int num  = Integer.parseInt(scan.nextLine());
        
        for(int i = 0; i < num; i++){
            for(int j = 1; j <= num; j++){
                System.out.print(j < num - i ? " " : "#" );
            }
            System.out.println("");
        }
        scan.close();
    }
}