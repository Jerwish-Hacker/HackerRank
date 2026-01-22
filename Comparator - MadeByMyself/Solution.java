import java.io.*;
import java.util.*;

// Comparator
public class Solution { 
      public static void main(String[] args){
          String[] arr = {"Justin" , "Ravi", "Rohit" , "AJ"};          
          Arrays.sort(arr,new Comparator<String>(){
          public int compare(String s1,String s2){
              if(s1.length() > s2.length()){
                return 1;
              }              
              else if(s1.length() < s2.length()){
                return -1;
              }
               return 0;
          }          
          });
          
          for(String s: arr){
              System.out.println(s);
          }
      }  
}
