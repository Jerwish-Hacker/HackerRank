import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        Pattern p = Pattern.compile("<(.+)>([^<]+)</\\1>");
        for(int i=0;i<count;i++){
          String text = scanner.nextLine();
          Matcher m = p.matcher(text);
          boolean flag=false;
          while(m.find()){
              System.out.println(m.group(2));
              flag=true;
          }
          if(flag==false){
            System.out.println("None");
          }
           
        }
     
	    }
    }
    



