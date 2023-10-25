class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        
        char[] str = new char[my_string.length()];
        
        for(int i = 0; i < my_string.length(); i++) {
            str[i] = my_string.charAt(i);
        }
        
        for(int i = 0; i < n; i++) {
            answer += str[i];
        }
        
        return answer;
    }
}