class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String s = Integer.toString(x);
        String[] str = s.split("");
        int num = 0;
        
        for(int i = 0; i < str.length; i++) {
            num += Integer.parseInt(str[i]);
        }
        if(x % num  != 0) {
            answer = false;
        } 
        return answer;
    }
}