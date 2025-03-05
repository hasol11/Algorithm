class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {0,0};
        for(int i=0;i<num_list.length;i++){
            int num= (num_list[i]%2==0) ? 0 : 1;
            answer[num]++;
        }
        return answer;
    }
}