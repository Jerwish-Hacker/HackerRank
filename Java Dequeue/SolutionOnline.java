import java.io.*;
import java.util.*;

public class SolutionOnline {

      public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            Deque<Integer> deque = new ArrayDeque<>();
            int n = in.nextInt();
            int m = in.nextInt();

            for (int i = 0; i < n; i++) {
                int num = in.nextInt();
                deque.addLast(num);
            }
            
            Map<Integer, Integer> hs = new HashMap<>();
            int maxsize = 0;
            int c = 0;
                                  
            for (int i: deque) { 
              if (c < m) {
                    int prev = hs.getOrDefault(i, 0);
                    hs.put(i, prev + 1);   
                }
                else {
                    // remove first
                    int elemfirst = deque.pollFirst();
                    int prevcount = hs.getOrDefault(elemfirst, 0);
                    if (prevcount > 1) {
                        hs.put(elemfirst, prevcount - 1);
                    } else {
                        hs.remove(elemfirst);
                    }
                    
                    // add new
                    int prev = hs.getOrDefault(i, 0);
                    hs.put(i, prev + 1);
                }
                
                c++;
            }
            
            System.out.println(hs.toString());
            
        }
    }
