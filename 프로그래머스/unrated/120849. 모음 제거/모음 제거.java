class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] str = {"a", "e", "i", "o", "u"};
        for(int i = 0; i < str.length; i++) {
            if(my_string.contains(str[i])) {
                answer = my_string.replaceAll(str[i], "");
                my_string = answer;
            } else {
                answer = my_string;
            }
        }
        return answer;
    }
}