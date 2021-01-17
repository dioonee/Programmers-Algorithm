import java.util.*;

public class KthNumber {
}

class Solution2 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i = 0; i< commands.length; i++) {
            answer[i] = one_solution(array, commands[i]);
        }
        return answer;
    }
    public int one_solution(int[] array, int[] command) {
        List<Integer> numList = new ArrayList<>();
        for (int i = command[0]-1; i< command[1]; i++) {
            numList.add(array[i]);
        }
        Collections.sort(numList);
        return numList.get(command[2]-1);
    }
}