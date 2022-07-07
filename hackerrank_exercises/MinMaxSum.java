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



    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
        Collections.sort(arr);//1 2 3 4 5
        long sum2 = arr.stream().skip(1).mapToLong(Long::valueOf).sum();
        long sum1 = arr.stream().limit(arr.size()-1).mapToLong(Long::valueOf).sum();
        System.out.println(sum1+" "+sum2);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}

