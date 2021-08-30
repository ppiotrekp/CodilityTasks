// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        Set<Integer> ints = new HashSet<>();
        int counter = 0;
        for (int i = 0; i < A.length; i++) {
            int a = Math.abs(A[i]);
            if (!ints.contains(a)) {
                ints.add(a);
                counter++;
            }
        }

        return counter;
    }
}