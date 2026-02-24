import java.io.*;
import java.util.*;

public class Employee{
  private int id;
  private String name;
  private double salary;
  
  public int getId(){
    return this.id;
  }  
  
  public void setId(int id){
    this.id=id;
  }
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }  
  
  public Employee(int id,String name,double salary){
      this.id=id;
      this.name = name;
      this.salary = salary;  
  }  
  
  public String toString(){
    return this.name;  
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
