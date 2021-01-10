
public class Year2016 {
}

class Solution3 {
    public String solution(int a, int b) {
        int totalDays = 0;
        String day[] = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int month[] = {31, 29, 31, 30, 31, 30,31, 31, 30, 31, 30, 31};
        for(int i =0;i<a-1;i++){
            totalDays += month[i];
        }
        totalDays += b-1;
        return day[totalDays%7];
    }
}