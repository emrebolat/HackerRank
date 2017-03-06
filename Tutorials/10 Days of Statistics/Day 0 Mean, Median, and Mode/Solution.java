import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        float total = 0;
        int[] value = new int[number];

        for (int x = 0; x < number; x++){
            value[x] = scan.nextInt();
            total = total + value[x];
        }

		Arrays.sort(value);

		float mean = total / number;
		System.out.println(mean);

		int middle = number / 2;

		if (number % 2 == 1) {
		System.out.println(value[middle]);
		}
		else {
		System.out.println((value[middle-1] + value[middle]) / 2.0);
		}

		int maxValue = 0, maxCount = 0;

		for (int i = 0; i < number; i++) {
		int count = 0;
			for (int j = 0; j < number; j++) {
				if (value[j] == value[i]){
					++count;
				}
			}
			if (count > maxCount) {
				maxCount = count;
				maxValue = value[i];
			}
		}
    System.out.println(maxValue);
    }
}