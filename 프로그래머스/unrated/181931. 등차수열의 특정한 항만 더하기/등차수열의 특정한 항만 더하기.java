class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int[] num = new int[included.length];
        
        for(int i = 0; i < included.length; i++) {
            num[i] = a + (i * d);
            if(included[i] == true) {
            answer += num[i];
        }
        }
        
        return answer;
    }
}