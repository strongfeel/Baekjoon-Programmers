class Solution {
    public int solution(int n, int k) {
        
        int survice = n/10 * 2000;
        int answer = n * 12000 + k * 2000 - survice;
        
        return answer;
    }
}