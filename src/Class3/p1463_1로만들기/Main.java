package Class3.p1463_1로만들기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Math;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        int dp[] = new int[number+1];  // 배열이 0부터 시작하므로 +1 까지 해야한다, 최소연산횟수를 dp[]
        dp[0] = 0;  // 0과 1은 사용할 수 없으므로 0으로 설정
        dp[1] = 0;

        for (int i = 2; i <= number; i++){
            dp[i] = dp[i-1] + 1;  // 기본적으로 i-1에서 1을 더한 경우를 생각 (1을 빼는 연산)
            if (i % 2 == 0) dp[i] = Math.min(dp[i], dp[i/2] + 1);  // 2로 나누어 떨어지는 경우를 생각하여 최소값 갱신
            if (i % 3 == 0) dp[i] = Math.min(dp[i], dp[i/3] + 1);  // 3으로 나누어 떨어지는 경우를 생각하여 최소값 갱신
        }

        System.out.println(dp[number]);  // 결과 출력
        br.close();
    }
}
