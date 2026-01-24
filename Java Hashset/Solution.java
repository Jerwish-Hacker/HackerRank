import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        Set<Set<String>> set = new HashSet<>();

        for (int i = 0; i < count; i++) {
            String s1 = scanner.next();
            String s2 = scanner.next();
            
            // create a unique representation of the pair
            Set<String> temp = new HashSet<>();
            temp.add(s1);
            temp.add(s2);
            set.add(temp);
            System.out.println(set.size());
        }

        scanner.close();
    }
}

