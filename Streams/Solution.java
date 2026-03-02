import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Solution{
    public static void main(String[] args){
      //List<Integer> nums = Arrays.asList(5, 2, 3, 5, 2, 10, 3, 20);
      //List<Integer> nums=Arrays.asList(5,2,3,77,85,15,35);
      //List<String> names = Arrays.asList("justin", "raj", "hcl");
      //List<Integer> nums = Arrays.asList(11,2,3,4,5,6,7,8,9,10);            
      //List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
      List<Integer> nums = Arrays.asList(12, 5, 18, 7, 20, 3, 25);
      
      List<Integer> result=nums.stream()
           .filter(n->n>10)
           .sorted(Comparator.reverseOrder())
           .collect(Collectors.toList());
      System.out.println(result);
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
//max
//min
//anyMatch
//allMatch
//noneMatch
//findFirst
//findAny
//reduce
