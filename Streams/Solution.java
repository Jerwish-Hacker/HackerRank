import java.util.*;
import java.util.stream.Collectors;
import java.lang.*;

class Solution{
  public static void main(String[] args){
    Map<String,Integer> map = new HashMap<>();
    map.put("Tamil",99);
    map.put("English",65);
    map.put("Maths",35);
        
    Map<String,Integer> result = map.entrySet()
       .stream()
       .filter(e -> e.getValue() > 90)
       .collect(Collectors.toMap());
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
