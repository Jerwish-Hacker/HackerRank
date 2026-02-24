import java.io.*;
import java.util.*;
import java.util.Comparator;
import java.util.Collections;

public class Solution{
  public static void main(String[] args){
    List<Employee> data = Employee.getData();
    System.out.println("Real Data - "+ data.toString());
    Collections.sort(data,new NameComparator());    
    System.out.println("Name Comparator - " + data.toString());
       
  }  

}


