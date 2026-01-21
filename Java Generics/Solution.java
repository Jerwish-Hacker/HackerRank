import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
          Object[] arr = {1, 2, 3, "Hello", "World"};
        
        printArray(arr);
    }
        static void printArray(Object[] arr) {
        for (Object o : arr) {
            System.out.println(o.toString());
        }
    }
}
