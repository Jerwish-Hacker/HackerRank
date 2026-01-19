import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();
        while(scanner.hasNext()){
            String s = scanner.nextLine();
            for(int i=0;i<s.length();i++){
                char c = s.charAt(i);                
                if(c == '{' || c == '}' || c == '[' || c == ']' || c == '(' || c == ')'){
                    stack.push(c);            
                }
            }
            System.out.println(stack.toString());
            stack.clear();
        }        
    }
}
