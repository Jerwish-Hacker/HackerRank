import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        
        int firstCount = scanner.nextInt();
        ArrayList<ArrayList<Integer>> mainArray= new ArrayList<>();
        
        // This is First section
        for(int i=0;i<firstCount;i++){
          int count = scanner.nextInt();
          ArrayList<Integer> box=new ArrayList<Integer>();
          for(int j=0;j<count;j++){            
              box.add(scanner.nextInt());
          }
          mainArray.add(box);
        }
         
        // Second section
        int secondCount = scanner.nextInt();
        for(int i=0;i<secondCount;i++){
            int indexOfArray = scanner.nextInt();
            int indexOfElement = scanner.nextInt();
            if(mainArray.size() >= indexOfArray){
                if(mainArray.get(indexOfArray-1).size() >= indexOfElement){
                  System.out.println(mainArray.get(indexOfArray-1).get(indexOfElement-1));
                }
                else{
                System.out.println("ERROR!");
                }
            }
            else{
                System.out.println("ERROR!");
            }
            
        }
        
        scanner.close();
    }
}
