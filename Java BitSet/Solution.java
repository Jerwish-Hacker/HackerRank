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
          String[] ss=scanner.nextLine().split(" ");
          String s =ss[0];
          int n1=Integer.valueOf(ss[1]);
          int n2=Integer.valueOf(ss[2]);
          if(s.equals("AND")){
             AND();
          }
          else if(s.equals("OR")){
              OR();
          }
          else if(s.equals("XOR")){
              XOR();
          }
          else if(s.equals("FLIP")){
              FLIP();
          }
          else if(s.equals("SET")){
              SET();
          }
        }
       
        scanner.close();        
    }
    public  static void AND(){
      System.out.println("AND");
    }
    public  static  void OR(){
     System.out.println("OR");
    }
    public  static void XOR(){
     System.out.println("XOR");
    }
    public  static void FLIP(){
     System.out.println("FLIP");
    }
    public  static void SET(){
     System.out.println("SET");
    }    
}

