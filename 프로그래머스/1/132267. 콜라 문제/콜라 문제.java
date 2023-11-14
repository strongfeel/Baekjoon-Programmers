class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        while(a <= n) {
            answer += n / a * b;
            n = (n / a * b) + (n % a);
        }
        return answer;
    }
}