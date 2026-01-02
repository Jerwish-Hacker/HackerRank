import java.io.*;
import java.util.*;
import java.util.List;
import java.math.*;

public class Solution {

    public static void main(String[] args) {      
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        //String[] nameList={"Rohit" , "Virat" , "Sachin" , "Dhoni" , "GhillChrist" ,  "Watson"};
        Scanner scanner = new Scanner(System.in);
        List<String> numArr = new ArrayList<String>();
        int count = Integer.parseInt(scanner.nextLine());
        while(count > 0){
            String num = scanner.nextLine();
            numArr.add(num);
            count--;
        }
        String[] array = numArr.toArray(String[]::new);
        Arrays.sort(array,(a, b) -> {
            BigDecimal b1 = new  BigDecimal(a);
            BigDecimal b2 = new  BigDecimal(b);
            return b2.compareTo(b1);
            }
        );                 
        for(String s : array){
          System.out.println(s);
        }
    }
}
