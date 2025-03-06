class Solution {
    public String solution(String code) {
        String answer="";
        int mod=0;
        for(int i=0;i<code.length();i++){
            if(mod==0){
                if(code.charAt(i)=='1'){
                    mod+=1;
                }else if(i%2==0){
                    answer+=code.charAt(i);
                }
            }else{
                if(code.charAt(i)=='1'){
                    mod-=1;
                }else if(i%2==1){
                    answer+=code.charAt(i);
                }
            }
        }
        
        return answer.isEmpty()?"EMPTY":answer;
    }
}