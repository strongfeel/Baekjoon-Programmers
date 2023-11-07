class Solution {
    public int solution(int a, int b) {
        Double db = (double) a / b ;
        String dbStr = String.valueOf(db);
 
        return dbStr.length() >= 16 ? 2 : 1;
    }
}