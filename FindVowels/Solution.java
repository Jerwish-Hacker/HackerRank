import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.lang.*;

public class Solution{
  public static void main(String[] args){
      String s="Programming";      
      List<Character> list = s.chars()
        .mapToObj(c-> (char)c)
        .filter(c-> c=='a' || c=='e' ||c=='i' || c=='o' || c=='u'  )
        .collect(Collectors.toList()); 
      System.out.println(list.size());
  }
}
