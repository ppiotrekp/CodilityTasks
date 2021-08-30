// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int N) {
        int minPerimeter = Integer.MAX_VALUE;
        for (int i = 1; i < N; i++) {
            if (N % i == 0) {
                int factor = N / i;
                int perimeter = 2*(factor + i);
                if (perimeter < minPerimeter) {
                    minPerimeter = perimeter;
                } 
            }
        }
        return minPerimeter;
    }


} //first attempt