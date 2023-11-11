class Solution {
    public String solution(String phone_number) {
        String a = phone_number.substring(0, phone_number.length() - 4);
        a = a.replaceAll(".", "*");
        
        String back = phone_number.substring(phone_number.length() - 4);
        a = a + back;
        return a;
    }
}