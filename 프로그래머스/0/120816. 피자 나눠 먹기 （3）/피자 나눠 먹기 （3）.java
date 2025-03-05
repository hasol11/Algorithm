class Solution {
    public int solution(int slice, int n) {
        //slice*result를 n으로 나누면 1이면 된다. 
        //2 1 1
        int result=0;
        if(slice>n){
            result=1;
        }else{
            while((slice*result/n)!=1){
            result++;
        }
        }
        
        return result;
    }
}