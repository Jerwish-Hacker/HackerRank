import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Solution{
    public static void main(String[] args){
      //List<Integer> nums = Arrays.asList(5, 2, 3, 5, 2, 10, 3, 20);
      //List<Integer> nums=Arrays.asList(5,2,3,77,85,15,35);
      //List<String> names = Arrays.asList("justin", "raj", "hcl");
      List<Integer> nums = Arrays.asList(11,2,3,4,5,6,7,8,9,10); 
      
      Optional<Integer> result = nums.stream()
          .max(Comparator.naturalOrder());
          
      
      System.out.println(result.get());
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
