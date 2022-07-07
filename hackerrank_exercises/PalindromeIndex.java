package hckrnk_exercises;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



class Result {

    /*
     * Complete the 'palindromeIndex' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int palindromeIndex(String s) {
    // Write your code here
        Scanner scanner = new Scanner(System.in);
        
        for(int i =0,j =s.length()-1; i<j; i++, j--)
            if(s.charAt(i)!=s.charAt(j))
                if(isPal(s, i))
                    return i;
                else if(isPal(s, j))
                    return j;
        return -1;
    }
    
    static boolean isPal(String s, int index){
        for(int i =index+1,j =s.length()-1-index; i<j; i++, j--)
            if(s.charAt(i)!=s.charAt(j))
                return false;
        return true;
        
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        for (int qItr = 0; qItr < q; qItr++) {
            String s = bufferedReader.readLine();

            int result = Result.palindromeIndex(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}

