import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>();
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        for(int i=0;i<count;i++){
          String choice = scanner.next();
          if(choice.equals("ENTER")){
              String[] temp = scanner.nextLine().split(" ");
              pq.add(new Student(temp[1],Double.parseDouble(temp[2]),Integer.parseInt((temp[3]))));
          }
          else{
            pq.poll();
          }
        }
        for(Student s:pq)
          System.out.println(s.toString());        
      }
}
class Student implements Comparable<Student>{
    private int id;
    private String name;
    private Double cgpa;

    public Student( String name, Double cgpa ,int id) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getCGPA() {
        return cgpa;
    }
    
    @Override
    public String toString(){
      return this.getName() + " "+ this.getCGPA()  + " - - - " + this.getId() ;      
    }
        
    @Override
    public int compareTo(Student other) {    
        if(!(Double.compare(this.getCGPA(), other.getCGPA()) == 0)){
            return Double.compare(other.getCGPA(), this.getCGPA());
        }
        else if(!(this.getName().equals(other.getName()))){            
            return this.getName().compareTo(other.getName());                       
        }
        else if(!(this.getId()==other.getId())){
          return this.getId() - other.getId();
        }
        return 0;      
    }
}

