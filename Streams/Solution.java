import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Solution{
    public static void main(String[] args){          
      
      List<Integer> nums = Arrays.asList(1, 2, 3, 4);
      
      Integer result = nums.stream()
                            .map(n->n*n)
                            .reduce(0,(a,b)-> a+b);
      
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
