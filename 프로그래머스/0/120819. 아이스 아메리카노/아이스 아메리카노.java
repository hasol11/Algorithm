class Solution {
    public int[] solution(int money) {
        int[] answer ={0,0};
        while(true){
            if((money-answer[0]*5500)<5500){
                answer[1]=money%5500;
                break;
            }
            answer[0]++; 
        }
        return answer;
    }
}