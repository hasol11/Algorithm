import java.lang.StringBuilder;

class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        StringBuilder sb =new StringBuilder(my_string);
        sb.replace(s,overwrite_string.length()+s,overwrite_string);
        String answer = sb.toString();
        return answer;
    }
}