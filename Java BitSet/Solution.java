import java.util.BitSet;

public class Solution {
    public static void main(String[] args) {
        BitSet bs = new BitSet();

        bs.set(2);      // index 2 -> true
        bs.set(3);      // index 5 -> true

        System.out.println(bs.get(2)); // true
        System.out.println(bs.get(3)); // false

        //bs.clear(2);    // set back to false

        System.out.println(bs);
    }
}

