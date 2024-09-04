package Class3.p1003_피보나치함수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//시간 오류로 인해 다시 만들어야 함
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

    public static int fibonacci(int n) {
        if (n == 0) {
            zero++;
            return 0;
        } else if (n == 1) {
            one++;
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
