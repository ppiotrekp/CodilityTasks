// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        Set <Integer> ints = new HashSet<>();
        if (A.length == 0) {
            return 1;
        }

        for (int i = 0; i < A.length; i++) {
            ints.add(A[i]);
        }

        for (int i = 1; i < A.length; i++) {
            if (ints.contains(i) == false) {
                return i;
            }
        }

        return A.length+1;
    }
}
