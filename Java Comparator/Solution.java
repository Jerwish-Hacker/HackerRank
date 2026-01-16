import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    
      Comparator<Integer> com = new Comparator<Integer>(){
        public int compare(Integer a,Integer b){
              if(a>b)return 1;
              else if(a==b) return 0;
              else return -1;
        }
      };
      
      Scanner scanner = new Scanner(System.in);
      int count = scanner.nextInt();
      Map<String,Integer> map=new HashMap<>();      
      for(int i=0;;i<count;i++;){
        String key=scanner.next();
        Integer value=scanner.nextInt();
        map.put(key,value);        
      }      
      Collections.sort(map,com);
      System.out.println(map);
    }
}
