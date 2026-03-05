import java.io.*;
import java.util.*;
import java.util.stream.Collectors; 


public class Solution{
  public static void main(String[] args){
    String s = "1234";
    char[] charArr = s.toCharArray(); 
    int left=0;
    int right = charArr.length-1;
    while(left < right){
      char temp = charArr[left];      
      charArr[left] = charArr[right];
      charArr[right] = temp;
      left++;
      right--;
    }
    System.out.println(charArr);
  }
}
