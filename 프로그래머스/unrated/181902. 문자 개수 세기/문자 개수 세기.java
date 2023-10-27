class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        String[] my_stringArr = my_string.split("");
        int[] num = new int[my_stringArr.length];
        
        for(int i = 0; i < my_stringArr.length; i++) {
            int item = my_stringArr[i].charAt(0);
            num[i] = item;
        }
        
        for(int i = 0; i < num.length; i++) {
            if(num[i] < 97) {
                int index = num[i] - 65;
                answer[index] += 1;
            } else {
                int index = num[i] - 71;
                answer[index] += 1;
            }
        }
        return answer;
    }
}