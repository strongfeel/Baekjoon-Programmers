import java.util.*;

class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];
        int idx = 0;
        
        for(int i=0; i<answer.length; i++){
            answer[i] = Arrays.copyOfRange(num_list, idx, idx+(n));
            idx += n;
        }
        return answer;
    }
}