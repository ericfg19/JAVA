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


class Result {

    /*
     * Complete the 'mostActive' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts STRING_ARRAY customers as parameter.
     */

    public static List<String> mostActive(List<String> customers) {
    // Write your code here
        Set<String> s=new TreeSet<>(customers); 
    int[] count=new int[s.size()]; 
    double[] value=new double[s.size()]; 
    int i=0; 
    for(String s1: s){ 
      for(String s2: customers){ 
        if(s1.equals(s2)){ count[i]++; 
        } 
      } 
      value[i]=(double)(count[i]*100)/s.size(); i++; 
    } 
    List<String> a=new ArrayList<>(); 
    String[] str=s.toArray(new String[s.size()]); 
    for(int j=0;j<s.size();j++){ 
      if(value[j]>=(double)5){ 
        a.add(str[j]); 
      } 
    } 
    return a;
    }

}
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int customersCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> customers = IntStream.range(0, customersCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        List<String> result = Result.mostActive(customers);

        bufferedWriter.write(
            result.stream()
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}

