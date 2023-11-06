import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int ans = s.length();
        for(int i = 0; i < s.length(); i++) {
            if(isPalind(s.substring(i))) {
                break;
            }
            ans++;
        }
        System.out.println(ans);
    }
    
    private static boolean isPalind(String s) {
        int start = 0;
        int last = s.length() - 1;
        while(start <= last) {
            if(s.charAt(start) != s.charAt(last))
                return false;
            start++;
            last--;
        }
        return true;
    }
}