import java.io.*;
import java.util.*;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */        
        Scanner scanner = new Scanner(System.in);        
        int count = Integer.parseInt(scanner.nextLine()); // read full line
        for(int i=0;i<count;i++){
        String text = scanner.nextLine();
          try {
            Pattern pattern = Pattern.compile(text);
            System.out.println("Valid");        
          }
          catch(Exception e) {
            System.out.println("Invalid");
          }
        }
     }
}
