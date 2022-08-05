package hckrnk_exercises;

import java.io.*;
import java.util.*;
import java.math.*;
public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BigInteger a;
        BigInteger b;
        a = new BigInteger(input.nextLine());
        b = new BigInteger(input.nextLine());
        BigInteger sum = BigInteger.valueOf(0);
        BigInteger product = BigInteger.valueOf(0);
        sum = sum.add(a);
        sum = sum.add(b);
        System.out.println(sum);
        product = a.multiply(b);
        System.out.println(product);
    }
}