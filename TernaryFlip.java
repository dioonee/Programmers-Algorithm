import java.math.*;

public class TernaryFlip {
    public static void main(String[] args) {
        Solution4 solution4 = new Solution4();
        System.out.println(solution4.solution(1));
    }
}

class Solution4 {
    public int solution(int n) {
        long flipped = flip(ternaryNum(n));
        //back to decimal
        int answer = 0, power = 0;
        while(flipped != 0) {
            answer += (Math.pow(3, power)) * (flipped % 10);
            flipped /= 10;
            power ++;
        }
        return answer;
    }
    public long ternaryNum(int n) {
        int power = 0;
        long result = 0;
        while(n != 0) {
            result += (Math.pow(10, power)) * (n % 3);
            power += 1;
            n /= 3;
        }
        return result;
    }
    public long flip(long n) {
        long result = 0;
        while(n != 0) {
            result = result * 10 + n % 10;
            n /= 10;
        }
        return result;
    }
}
