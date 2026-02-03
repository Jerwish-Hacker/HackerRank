import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
      /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scanner = new Scanner(System.in);        
      int count = Integer.parseInt(scanner.nextLine()); // read full line
      String regex="^[A-Za-z][A-Za-z0-9_]{7,29}$";
      
      for(int i=0;i<count;i++){
        String text=scanner.nextLine();        
        if(text.matches(regex)){
            System.out.println("Valid");
        }
        else{
            System.out.println("Invalid");
        }
      }
      scanner.close();
     }
}import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
      /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scanner = new Scanner(System.in);        
      int count = Integer.parseInt(scanner.nextLine()); // read full line
      String regex="^[A-Za-z][A-Za-z0-9_]{7,29}$";
      
      for(int i=0;i<count;i++){
        String text=scanner.nextLine();        
        if(text.matches(regex)){
            System.out.println("Valid");
        }
        else{
            System.out.println("Invalid");
        }
      }
      scanner.close();
     }
}
