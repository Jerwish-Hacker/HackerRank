import java.io.*;
import java.util.*;
import java.util.Comparator;
import java.util.Collections;


public class NameComparator implements Comparator<Employee>{
    public int compare(Employee e1,Employee e2){
        return e1.getName().compareTo(e2.getName());
    }
}
