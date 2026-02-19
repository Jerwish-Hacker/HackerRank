import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Solution{
    public static void main(String[] args){
      //List<Integer> nums = Arrays.asList(5, 2, 3, 5, 2, 10, 3, 20);
      //List<Integer> nums=Arrays.asList(5,2,3,77,85,15,35);
      //List<String> names = Arrays.asList("justin", "raj", "hcl");
      Map<String,String> map=new HashMap<>();
      
      map.put("100","Raj");
      map.put("101","Rahul");
      map.put("102","Justin");
      
      map.values().stream()
         .forEach(n -> System.out.println(n));
      
    }
}
// I know this following 
//filter
//map
//collect
//sorted
//distinct
//limit
//skip
//count
