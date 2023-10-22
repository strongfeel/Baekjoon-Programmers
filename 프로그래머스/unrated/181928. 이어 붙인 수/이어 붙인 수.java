class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String jjak = "";
        String hol = "";
        
        for(int i = 0; i < num_list.length; i++) {
            if(num_list[i] % 2 == 0) {
                jjak += Integer.toString(num_list[i]);
            } else {
                hol += Integer.toString(num_list[i]);
            }
        }
        answer = Integer.parseInt(jjak) + Integer.parseInt(hol);
        return answer;
    }
}