import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        int length = my_string.length();
        String[] str = new String[length];
        
        for(int i = 0; i < length; i++) {
            str[i] = my_string.substring(i);
        }
        
        Arrays.sort(str);
        
        return str;
    }
}