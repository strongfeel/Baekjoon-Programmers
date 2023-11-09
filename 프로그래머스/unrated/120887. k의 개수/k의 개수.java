class Solution {
    public int solution(int i, int j, int k) {
        int answer=0;
            for(int a=i; a<=j; a++) {                       
                String s=String.valueOf(a);                 
                char[] ch=s.toCharArray();                  
                for(int b=0; b<ch.length; b++) {            
                    if(ch[b]==Character.forDigit(k, 10)) {  
                        answer++;                           
                    }
                }
            }
        return answer;
    }
}