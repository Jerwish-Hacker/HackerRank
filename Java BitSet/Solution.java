import java.io.*;
import java.util.*;


public class Solution {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();        
        BitSet bs = new BitSet(length);
        int count = scanner.nextInt();
        
        scanner.nextLine();
        
       for(int i=0;i<count;i++){
          String s=scanner.nextLine();
          System.out.println(s);
       }
       
       scanner.close();
    }
}

