import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        Arrays.sort(array); 
        int b = array.length / 2;
        return array[b]; 
    }
}
