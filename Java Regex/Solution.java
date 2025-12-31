import java.util.Scanner;
import java.util.regex.Pattern;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String regex =
            "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}" +
            "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";

        while (sc.hasNextLine()) {
            String ip = sc.nextLine();
            System.out.println(ip.matches(regex));
        }
        sc.close();
    }
}

