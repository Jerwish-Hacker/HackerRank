import java.util.*;

public class Solution{
  public static void main(String[] args){
      int[] arr = {10, 25, 7, 99, 56};
      int result=0;
      for(int i:arr){
        if(result<i){
          result=i;
        }
      }
      System.out.println(result);
  }
}
