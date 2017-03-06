import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Map<String, Integer> phoneBook = new HashMap<String, Integer>();

        for(int i = 0; i < n; i++){
            String name = scan.next();
            int phone = scan.nextInt();
            phoneBook.put(name, phone);
        }
        while(scan.hasNext()){
            String s = scan.next();
            String print = phoneBook.get(s) != null ? (s + "=" + phoneBook.get(s)) : "Not found";

            System.out.println(print);
        }
        scan.close();
    }
}