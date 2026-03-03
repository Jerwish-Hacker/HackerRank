import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Solution{
    public static void main(String[] args){
      
      List<String> names = Arrays.asList("Justin", "Raj", "Arun", "Kiran", "Ravi", "Jo");
      
      List<String> result=names.stream()
            .filter(n->n.length()>3)
            .map(s-> s.toUpperCase())
            .sorted(Comparator.naturalOrder())
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
