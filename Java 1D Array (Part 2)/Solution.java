import java.io.*;
import java.util.*;

public class Solution {
    
    public static boolean canWin(int leap,int[] arr,boolean[] position,int pos){
      
      if( pos >= arr.length ) return true;
      
      if(pos < 0 || arr[pos] != 0 ||  position[pos] )return false;
      
      position[pos]=true;
      
      return canWin(leap, arr, position, pos+1) || 
             canWin(leap, arr, position, pos-1) ||
             canWin(leap, arr, position, pos+leap);    
    }
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count =scanner.nextInt();
        for(int i=0 ;i < count ;i++){
          int size= scanner.nextInt();
          int leap=scanner.nextInt();
          int[] arr=new int[size];
          for(int j=0;j<size;j++){
              arr[j]=scanner.nextInt();
          }
          System.out.println( (canWin(leap, arr,new boolean[size],0)) ? "YES" : "NO" );
        }
    }
}
