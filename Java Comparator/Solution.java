import java.io.*;
import java.util.*;
import java.util.Comparator;
import java.util.Collections;

class Player {
    String name;
    int score;

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

class Checker implements Comparator<Player> {
    @Override
    public int compare(Player a, Player b) {
        // Sort by score in descending order
        if (a.score != b.score) {
            return b.score - a.score;
        }
        // If scores are equal, sort by name in ascending order
        return a.name.compareTo(b.name);
    }
}

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] players = new Player[n];
        for (int i = 0; i < n; i++) {
            String name = scan.next();
            int score = scan.nextInt();
            players[i] = new Player(name, score);
        }

        // Sort using Checker comparator
        Arrays.sort(players, new Checker());

        // Print output
        for (Player p : players) {
            System.out.println(p.name + " " + p.score);
        }

        scan.close();
    }
}

