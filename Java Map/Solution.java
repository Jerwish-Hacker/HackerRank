import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        Scanner scanner = new Scanner(System.in);        
        int count = Integer.parseInt(scanner.nextLine());
        for(int i=0;i<count;i++){
            String name = scanner.nextLine();
            String number = scanner.nextLine();
            map.put(name,number);                             
        }        
        while(scanner.hasNextLine()){            
            String name = scanner.nextLine();         
            if(map.containsKey(name)){
                System.out.println(name + "=" +map.get(name));
            }
            else{
               System.out.println("Not found");            
            }
        }
    }
}
