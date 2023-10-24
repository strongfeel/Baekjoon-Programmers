class Solution {
    public int solution(String number) {
        int answer = 0;
        String[] number_list = number.split("");
        int add = 0;
        
        for(int i = 0; i < number_list.length; i++) {
            add += Integer.parseInt(number_list[i]);
        }
        answer = add % 9;
        return answer;
        
    
    }
}