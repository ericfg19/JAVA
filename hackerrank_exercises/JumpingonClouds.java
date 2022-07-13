package hckrnk_exercises;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        if(n==2 || n==3){
            System.out.println(1);
        }else{// n=6  0 0 0 0 1 0
            int i=0;
            int count = 0;
            while(i<=n-2){
                if((i+2)<n && arr[i+2]!=1){
                    i = i+2;
                    count++;
                }else{
                    i = i+1;
                    count++;
                }
            }   
            System.out.println(count);
        }
    }
}
