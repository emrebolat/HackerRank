import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        int[][] matrix = new int[N][N];

        for(int i=0; i < N; i++){
            for(int j=0; j < N; j++){
                matrix[i][j] = scan.nextInt();
            }
        }

        int sumr, suml, sum;
        int j = N-1;
        sumr = 0;
        suml = 0;

        for(int i=0; i < N; i++){
            sumr += matrix[i][i];
            suml += matrix[i][j];
            j--;
        }

        sum = sumr - suml;
        System.out.println(Math.abs(sum));
        scan.close();
    }
}