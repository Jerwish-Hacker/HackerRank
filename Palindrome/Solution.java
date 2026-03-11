import java.util.*;

public class  Solution{
  public static void main(String[] args){
    String s= "madam";
    char[] cArr = s.toCharArray();
    int left=0;
    int right = s.length()-1;    
    while(left < right){    
      char c = cArr[left];
      cArr[left] = cArr[right];
      cArr[right] = c;
      left++;
      right--;
    }    
    System.out.println(s.equals(cArr));
    System.out.println(s);
    System.out.println(cArr);
  }
}
