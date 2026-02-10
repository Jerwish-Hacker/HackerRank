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
          
          if(deque.size()>k){
              Object one = deque.removeFirst();
             if (!deque.contains(one)){
                  set.remove(one);  
              }
          }          
          set.add(temp);                    
          if(maxUnique<set.size()){
              maxUnique=set.size();
          }
        }
        System.out.println(maxUnique);                          
    }
}
