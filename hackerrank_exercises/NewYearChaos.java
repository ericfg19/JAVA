package hckrnk_exercises;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int numberOfBribes(int[] q,int ind){
        
        int length = q.length;
        int Bribe = 0;
        int i;
        
        for(i=ind ;i<length;i++)
        {
            if(q[i] == ind+1){
                Bribe += i - ind;
                break;
            }
        }

        for(int j=i;j>ind;j--)
        {
            q[j] = q[j-1];
        }

        return Bribe;
    }

    // Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {

        int length = q.length;
        int bribes = 0;
        
        for(int i=0;i<length;i++){
            if(q[i] > i+3){
                System.out.println("Too chaotic");
                return;
            }
        }
        for(int i=0;i<length;i++){
            if(q[i]-1 != i)
                bribes += numberOfBribes(q,i);               
        }
        System.out.println(bribes);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] q = new int[n];

            String[] qItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
            }

            minimumBribes(q);
        }

        scanner.close();
    }
}
