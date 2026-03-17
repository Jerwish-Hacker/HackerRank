import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Solution{
    public static void main(String[] args){          
      
      List<Integer> nums = Arrays.asList(55, 13, 19, 22, 18);
      
      List<String> result = nums.stream()
                                 .map(n-> String.valueOf(n))
                                 .filter(s -> s.startsWith("1"))
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
