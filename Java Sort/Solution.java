import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        List < Student > list = new ArrayList < > ();
        for (int i = 0; i < count; i++) {
            String s = scanner.nextLine();
            String[] result = s.split(" ");
            list.add(new Student(Integer.parseInt(result[0]), result[1], Double.parseDouble(result[2])));
        }
        Collections.sort(list);
        for (Student s: list) {
            System.out.println(s.getName());
        }

    }
}

class Student implements Comparable < Student > {
    Integer id;
    String name;
    double cgpa;

    public Student(Integer id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    @Override
    public int compareTo(Student s1) {
        if (s1.getCgpa() > this.cgpa) {
            return 1;
        } else if (s1.getCgpa() < this.cgpa) {
            return -1;
        } else if (!s1.getName().equals(this.name)) {
            return this.name.compareTo(s1.getName());
        }
        return s1.getId().compareTo(this.id);

    }


    public Integer getId() {
        return id;
    }

    // Setter method for id (Mutator method)
    public void setId(Integer id) {
        this.id = id;
    }

    // Getter method for name
    public String getName() {
        return name;
    }
    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }
    // Getter method for cgpa
    public double getCgpa() {
        return cgpa;
    }
    // Setter method for cgpa
    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }
}
