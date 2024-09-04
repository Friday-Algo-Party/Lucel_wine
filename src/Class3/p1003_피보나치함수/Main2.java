package Class3.p1003_피보나치함수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {

    static int[][] dp = new int[41][2];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 초기화: N = 0과 N = 1에 대해서 이미 알고 있는 값을 설정합니다.
        // dp[n][0]은 fibonacci(n) 호출 시 출력되는 0의 횟수
        // dp[n][1]은 fibonacci(n) 호출 시 출력되는 1의 횟수
        dp[0][0] = 1; // N=0일 때 0 호출 횟수
        dp[0][1] = 0; // N=0일 때 1 호출 횟수
        dp[1][0] = 0; // N=1일 때 0 호출 횟수
        dp[1][1] = 1; // N=1일 때 1 호출 횟수

        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 수
        int[] resultsZero = new int[T];
        int[] resultsOne = new int[T];

        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            fibonacci(n);
            resultsZero[i] = dp[n][0];
            resultsOne[i] = dp[n][1];
        }

        for (int i = 0; i < T; i++) {
            System.out.println(resultsZero[i] + " " + resultsOne[i]);
        }
    }

    public static void fibonacci(int n) {
        // 이미 계산된 값을 재사용합니다.
        for (int i = 2; i <= n; i++) {
            if (dp[i][0] == 0 && dp[i][1] == 0) {
                dp[i][0] = dp[i-1][0] + dp[i-2][0];
                dp[i][1] = dp[i-1][1] + dp[i-2][1];
            }
        }
    }
}
