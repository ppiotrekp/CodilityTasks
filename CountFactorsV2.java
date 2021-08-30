// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int N) {
        int i = 1;
        int cntFactor = 0;
        
        while (i < Math.sqrt(N)) {
            if (N % i == 0)
                cntFactor += 2;
            i++;
        }
        
        if (i * i == N)
            cntFactor += 1;

        return cntFactor;
    }
}