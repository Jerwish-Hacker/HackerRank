import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length=scanner.nextInt();
        int k=scanner.nextInt(); 
        int maxUnique =0;
        Deque deque = new ArrayDeque<>();
        for(int i=0;i<k;i++){
          int temp=scanner.nextInt();
          deque.add(temp);
        }
        System.out.println(deque.toString());
    }
}
