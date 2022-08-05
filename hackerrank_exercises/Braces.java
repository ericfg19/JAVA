package hckrnk_exercises;

import java.util.*;
import java.util.Scanner;

// Write your code here. DO NOT use an access modifier in your class declaration.
class Parser{
    
    static Character getOpeningChar(Character c) {
        if (c == ')')
            return '(';
            else if (c == ']')
                return '[';
                else
                    return '{';
    }
    
    static boolean isBalanced(String s) 
    {
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0; i< s.length(); i++) {
            char x = s.charAt(i);
            
            if (x == '(' || x == '[' || x == '{') {
                stack.push(x);
                continue;
            }
            
            if (stack.isEmpty() || stack.pop() != getOpeningChar(x)) {
                return false;
            }
        }
        
        return stack.isEmpty();
    }
    
}

class Solution {
	
	public static void main(String[] args) {
		Parser parser = new Parser();
        
		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			System.out.println(parser.isBalanced(in.next()));
		}
        
		in.close();
	}
}
