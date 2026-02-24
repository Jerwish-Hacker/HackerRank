import java.io.*;
import java.util.*;
import java.util.Comparator;
import java.util.Collections;

public class Solution{
  public static void main(String[] args){
    List<Employee> data = getData();
    System.out.println(data);
      
  }
  
  public static List<Employee> getData(){    
    Employee e1 = new Employee(101, "Justin", 50000);
    Employee e2 = new Employee(102, "Virat", 60000);
    Employee e3 = new Employee(103, "Rahul", 55000);
    Employee e4 = new Employee(104, "Anita", 70000);
    Employee e5 = new Employee(105, "Kiran", 65000);
    Employee e6 = new Employee(106, "Arun", 48000);
    Employee e7 = new Employee(107, "Meena", 72000);
    Employee e8 = new Employee(108, "Vikram", 53000);
    Employee e9 = new Employee(109, "Sneha", 61000);
    Employee e10 = new Employee(110, "Ravi", 58000);
    return Arrays.asList(e1,e2,e3,e4,e5,e6,e7,e8,e9,e10);
  }
}


