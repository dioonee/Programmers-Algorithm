public class MiddleLetter {
}

class Solution5 {
    public String solution(String s) {
        if (s.length()%2 == 0) { //even number
            return s.substring(s.length()/2 -1, s.length()/2 + 1);
        }
        else {
            char ch = s.charAt(s.length()/2);
            return Character.toString(ch);
        }
    }
}