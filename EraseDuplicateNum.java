import java.util.*;

public class EraseDuplicateNum {
}

class Solution6 {
    public int[] solution(int []arr) {
        List<Integer> answer = new ArrayList<>();
        int currentNum = arr[0];
        answer.add(currentNum);

        for (int i = 1; i<arr.length; i++) {
            if (arr[i] == currentNum) { }
            else {
                currentNum = arr[i];
                answer.add(currentNum);
            }
        }
        int[] result = new int[answer.size()];
        for (int i = 0; i<result.length; i++ ) {
            result[i] = answer.get(i);
        }
        return result;
    }
    
}

