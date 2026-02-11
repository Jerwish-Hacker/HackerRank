import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        List<Student> list=new ArrayList<>();
        
    }
}
class Student implements Comparable<Student> {
    private int id;
    private String name;
    private double cgpa;

    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCGPA() {
        return cgpa;
    }
    
    @Override
    public int compareTo(Student other) {
        if( !(this.getCGPA() == other.getCGPA()) ){        
          if(this.getCGPA() < other.getCGPA()){
              return 1;
          }
          return -1;
        }        
    }
}

