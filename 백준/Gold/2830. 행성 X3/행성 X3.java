import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] names = new int[n];
        int[] count = new int[20];
        long sum = 0;
        
        //모든 주민 이름 담기
        for(int i = 0; i < n; i++) {
            names[i] = Integer.parseInt(br.readLine());
        }
        
        //각 자리수의 1의 개수 세기
        for(int i = 0; i < n; i++) {
            int name = names[i];
            int index = 0;
            while (name > 0) {
                count[index++] += name % 2;// count[0]부터 index를 1씩 증가시키며 비트가 1인 경우 1씩 저장
                name /= 2; // 비트에 저장한 값 만큼 뺀 것과 동일
            }
        }
        
        //행성 가치 구하기
        for(int i = 19; i >= 0; i--) {
            sum += (long) count[i] * (n - count[i]); // 비트가 1인 경우 * 비트가 0인 경우
            sum <<= 1; // sum에 2를 곱한 것과 같은 효과 
        }
        sum >>= 1; // 마지막은 2를 안 곱해도 괜찮은데 for문의 마지막에 곱했으므로 2로 나누기
        System.out.println(sum);
    }
}