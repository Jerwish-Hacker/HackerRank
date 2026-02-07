import java.io.*;
import java.util.*;


public class Solution {
    
    public static void main(String[] args) {        
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();        
        BitSet bs1 = new BitSet(length);
        BitSet bs2 = new BitSet(length);        
        int count = scanner.nextInt();        
        scanner.nextLine();        
        for(int i=0;i<count;i++){
          String[] ss=scanner.nextLine().split(" ");
          String s =ss[0];
          int n1=Integer.valueOf(ss[1]);
          int n2=Integer.valueOf(ss[2]);
          if(s.equals("AND")){            
               if(n1==1){                
                bs1.and(bs2);
              }
              else if(n1==2){
                bs2.and(bs1);
              } 
          }
          else if(s.equals("OR")){
              if(n1==1){                
                bs1.or(bs2);
              }
              else if(n1==2){
                bs2.or(bs1);
              } 
          }
          else if(s.equals("XOR")){
              if(n1==1){                
                bs1.xor(bs2);
              }
              else if(n1==2){
                bs2.xor(bs1);
              } 
          }
          else if(s.equals("FLIP")){              
              if(n1==1){                
                bs1.flip(n2);
              }
              else if(n1==2){
                bs2.flip(n2);
              } 
          }
          else if(s.equals("SET")){              
               if(n1==1){
                  bs1.set(n2);
               }
               else if(n1==2){
                  bs2.set(n2);
              }
          }
          System.out.println(bs1.cardinality() + " " + bs2.cardinality());
        }        
        scanner.close();        
    } 
}

