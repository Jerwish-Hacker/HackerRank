import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length=scanner.nextInt();
        int k=scanner.nextInt(); 
        int maxUnique =0;        
        Deque deque = new ArrayDeque<>();
        Set<Object> set=new HashSet<>();
        
        for(int i=0;i<length;i++){
          int temp=scanner.nextInt();
          deque.add(temp);
        }
        System.out.println(deque);
        
        for(int i=0;i<k;i++){
          set.add(deque.removeFirst());          
        }
        maxUnique= set.size();
        
        for(int i =k;i<deque.size-1;i++){
           
           
          if(maxUnique<0){
            maxUnique = 0;
          }
        }        
    }
}
