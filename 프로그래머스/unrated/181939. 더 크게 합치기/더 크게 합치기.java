class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String result1 = a + "" + b;
        String result2 = b + "" + a;
        
        int x = Integer.parseInt(result1);
        int y = Integer.parseInt(result2);
        
        if(x > y) {
            answer = x; 
        } else {
            answer = y;
        }
        return answer;
    }
}