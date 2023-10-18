import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            numbers.add(Integer.valueOf(sc.next()));
        }

        List<Stack<Integer>> stackList = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            stackList.add(new Stack<>());
            stackList.get(i).push(0);
        }

        boolean isFlag = true;
        for (int number : numbers) {
            boolean isNumber = false;
            for (Stack<Integer> integers : stackList) {
                if (number > integers.peek()) {
                    integers.push(number);
                    isNumber = true;
                    break;
                }
            }

            if (!isNumber) {
                isFlag = false;
                break;
            }
        }

        if (isFlag) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
