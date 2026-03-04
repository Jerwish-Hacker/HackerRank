import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Solution{
    public static void main(String[] args){          
      
      List<String> words = Arrays.asList("Java", "Stream", "API", "Programming");
      
      Optional<String> result = words.stream()                            
                            .reduce((a, b) -> a.length() > b.length() ? a : b);
      
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
//max
//min
//anyMatch
//allMatch
//noneMatch
//findFirst
//findAny
//reduce
