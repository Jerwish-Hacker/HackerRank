import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();
        while(scanner.hasNext()){
            String s = scanner.nextLine().trim();
            for(int i=0;i<s.length();i++){
                char c = s.charAt(i);                
                if(stack.empty() && (c == '}' || c == ')' || c == ']') ){                    
                    stack.add(c);
                    break;
                }
                else if(c == '{' || c == '(' || c == '[' ){
                    stack.push(c);
                }                
                else if( (c == '}' && stack.peek() == '{') || (c == ')' && stack.peek() == '(' ) || (c == ']' && stack.peek() == '[' )){
                      stack.pop();                      
                }               
            }
            System.out.println(stack.empty());
            stack.clear();
        } 
    }
}

