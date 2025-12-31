import java.util.*;
import java.util.regex.*;


public class Solution {
    public static void main(String[] args) {       
       Scanner scanner = new Scanner(System.in);        
      int count = Integer.parseInt(scanner.nextLine()); // read full line
      for(int i=0;i<count;i++){
        String text = scanner.nextLine();
        String regex = "\\b(\\w+)(\\s+\\1\\b)+";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(text);
        while (m.find()) {
                text = text.replaceAll(m.group(), m.group(1));
        }
        System.out.println(text);
        }
        scanner.close();
    }
}

