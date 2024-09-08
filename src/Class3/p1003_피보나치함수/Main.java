package Class3.p1003_피보나치함수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//통과!
public class Main {

    static int zero = 0;
    static int one = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());  // 테스트 케이스의 수를 입력받음
        int[] resultsZero = new int[n];
        int[] resultsOne = new int[n];

        for (int i = 0; i < n; i++) {
            int k = Integer.parseInt(br.readLine());
            zero = 0;
            one = 0;
            fibonacci(k);
            resultsZero[i] = zero;
            resultsOne[i] = one;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(resultsZero[i] + " " + resultsOne[i]);
        }
    }

    public static void fibonacci(int n) {
        if (n == 0) {
            zero++;
        } else if (n == 1) {
            one++;
        } else {
            int[] fib_zero = new int[n + 1];
            int[] fib_one = new int[n + 1];

            fib_zero[0] = 1;
            fib_one[0] = 0;
            fib_zero[1] = 0;
            fib_one[1] = 1;

            for (int i = 2; i <= n; i++) {
                fib_zero[i] = fib_zero[i - 1] + fib_zero[i - 2];
                fib_one[i] = fib_one[i - 1] + fib_one[i - 2];
            }

            zero = fib_zero[n];
            one = fib_one[n];
        }
    }
}