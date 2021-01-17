import java.util.*;
import java.util.stream.IntStream;

public class GymWear {
}
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] students = new int[n];
        for (int i = 0; i<n; i++) {
            students[i] = 1;
            if (containNum(i+1, reserve)) {
                students[i] += 1;
            }
            if (containNum(i+1, lost)) {
                students[i] -= 1;
            }
        }
        //borrow
        for (int i = 0; i<n ; i++) {
            if (students[i] == 0) {
                if( i != 0) {
                   if (students[i-1] == 2) {
                       students[i-1] -= 1;
                       students[i] += 1;
                       continue;
                   }
                }
                if ( i != n-1) {
                    if (students[i+1] == 2) {
                        students[i+1] -= 1;
                        students[i] += 1;
                    }
                }
            }
        }
        //count
        int answer = 0;
        for (int num : students) {
            if (num > 0) {
                answer ++;
            }
        }
        return answer;
    }

    public boolean containNum(int n, int[] intArray) {
        for (int num : intArray) {
            if (num == n) {
                return true;
            }
        }
        return false;
    }
}