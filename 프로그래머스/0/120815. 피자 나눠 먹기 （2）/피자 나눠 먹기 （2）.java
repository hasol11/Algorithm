class Solution {
    public int solution(int n) {
        int answer=0;
        if(n>6){
            for(int i=6;i<=6*n;i++){
                if(i%n==0&&i%6==0){
                    answer=i;
                    break;
                }
            }
        }else{
            for(int i=6;i<=6*n;i++){
                if(i%n==0&&i%6==0){
                    answer=i;
                    break;
                }
            }
        }
        answer/=6;
        return answer;
    }
}