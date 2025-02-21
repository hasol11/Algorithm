class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        int cnt=0;
        for(int i=0;i<(str1.length()+str2.length())/2;i++){
            answer+=str1.charAt(cnt);
            answer+=str2.charAt(cnt);
            cnt++;
        }
        
        
        return answer;
    }
}