package hckrnk_exercises;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();

        Stack<String> stack = new Stack<String>();
        StringBuilder printer = new StringBuilder();

        for (int i = 0; i < q; i++) {
            int currOp = in.nextInt();
            
            if (currOp == 1) {
                String addStr = in.next();
                String top = stack.isEmpty() ? "" : stack.peek();
                stack.push(top + addStr);
            } else if (currOp == 2) {
                int deleteCnt = in.nextInt();
                String top = stack.isEmpty() ? "" : stack.peek();
                top = top.substring(0, top.length() - deleteCnt);
                stack.push(top);
            } else if (currOp == 3) {
                int idx = in.nextInt();
                // this line cause timeout
                // System.out.println(stack.peek().charAt(idx - 1));
                printer.append(stack.peek().charAt(idx - 1)).append("\n");
            } else {
                stack.pop();
            }
        }

        System.out.println(printer.toString());
        in.close();
    }
}