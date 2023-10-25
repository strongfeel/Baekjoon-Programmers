import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> arr = new ArrayList<>();
        
        for(String str : intStrs) {
            int i = Integer.parseInt(str.substring(s, s+l));
            if(i > k) {
                arr.add(i);
            }
        }
        return arr.stream().mapToInt(i->i).toArray();
    }
}