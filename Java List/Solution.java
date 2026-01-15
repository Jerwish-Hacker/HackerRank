import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int count=scanner.nextInt();
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<count;i++){
            list.add(scanner.nextInt());   
        }
        count =scanner.nextInt();
        for(int i=0;i<count;i++){
            //System.out.println(i);
            String option= scanner.next();
            //System.out.println(option);
            if(option.equals("Insert")){
                int index=scanner.nextInt();
                int element=scanner.nextInt();
                list.add(index, element);
            }
            else if(option.equals("Delete")){
                int index=scanner.nextInt();
                list.remove(index);
            }
        }        
        
        for(Integer i:list){
                System.out.print(i + " ");    
        }
        
    }
}
