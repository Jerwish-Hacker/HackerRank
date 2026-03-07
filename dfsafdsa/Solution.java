import java.io.*;
import java.util.*;
import java.util.stream.Collectors; 


public class Solution{
  public static void main(String[] args){
    String s = "madam";
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
    if(s.equals(new String(charArr))){
      System.out.println("Palindrome");
    }
    else{
      System.out.println("Not Palindrome");
    }
  }
}
