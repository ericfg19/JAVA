package hckrnk_exercises;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 1;
        
        while(scan.hasNext()) {
            String str =  scan.nextLine();
            System.out.println(i+" " +str);
            i++;
        }
        
        scan.close();
    }
}