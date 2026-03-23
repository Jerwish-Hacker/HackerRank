import java.util.*;
import java.util.stream.Collectors;
import java.lang.*;

class Solution{
  public static void main(String[] args){
   
   String[] sArr = {"9677548836A","9876543210L"};
   
   List<String> list =  Arrays.asList(sArr);
   
   Map<String,String> map=list.stream()
                               .collect(Collectors.toMap(e->e.substring(0,e.length()-1),e->e.substring(e.length()-1)));
  
    map.entrySet()
       .forEach(System.out::println);
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
