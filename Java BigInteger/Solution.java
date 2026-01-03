import java.io.*;
import java.util.*;
import java.math.BigInteger;
import java.util.Scanner; // Import



public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner= new Scanner(System.in);
        String num1 = scanner.nextLine();
        String num2 = scanner.nextLine();
        
        BigInteger b1=new BigInteger(num1);
        BigInteger b2=new BigInteger(num2);
        
        
        System.out.println(b1.add(b2));
        System.out.println(b1.multiply(b2));        
    }
}
