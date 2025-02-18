class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        
    	int denom3 = denom1*denom2;
    	int numer3 = numer1*denom2+numer2*denom1;
    	
    	int num =0;
    	
    	if(denom3>=numer3) {
    		for(int i=numer3;i>0;i--) {
    			if(numer3%i==0 && denom3%i==0) {
    				num=i;
    				break;
    			}
    		}
    	}else if(numer3>denom3) {
    		for(int i=denom3;i>0;i--) {
    			if(numer3%i==0 && denom3%i==0) {
    				num=i;
    				break;
    			}
    		}
    	}

        int[] answer = new int [2];
        answer[0]= numer3/num;
        answer[1]= denom3/num;
        return answer;
    }
}