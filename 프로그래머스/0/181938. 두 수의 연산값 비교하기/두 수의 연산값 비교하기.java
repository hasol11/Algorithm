class Solution {
    public int solution(int a, int b) {
        //String a+b vs 2*a*b
        int cal1=Integer.parseInt(Integer.toString(a)+Integer.toString(b));
        int cal2=2*a*b;
        int answer=(cal1>cal2)? cal1: cal2;
        return answer;
    }
}