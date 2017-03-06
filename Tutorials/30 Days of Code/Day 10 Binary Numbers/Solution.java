import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int counter = 0, max = 0;

        while(n > 0){
            int rem = n % 2;
            n = n / 2;

            if (rem == 1){
                counter++;
                if(counter >= max){
                    max = counter;
                }
            }
            else{
                counter = 0;
            }
        }
        System.out.println(max);
    }
}