import java.io.*;
import java.util.*;
// Comparator 
public class Solution { 
      public static void main(String[] args){
          List<Integer> arr =  Arrays.asList(85,22, 23, 14, 95);          
          Collections.sort(arr,new Comparator<Integer>(){             
            @Override
            public int compare(Integer a,Integer b){
              if(a>b){
                return 1;
              }
              return -1;
            }              
          });
          System.out.println(arr.toString());
      }  
}
