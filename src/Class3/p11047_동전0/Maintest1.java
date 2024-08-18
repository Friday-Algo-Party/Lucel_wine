package Class3.p11047_동전0;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Maintest1 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] coin = new int[N];

        for (int i = 0; i < N; i++) {
            coin[i] = Integer.parseInt(br.readLine());
        }

        //dp[i]는 i원을 만드는데 필요한 최소 동전 개수를 저장한다
        int[] dp = new int[K + 1];

        //dp 배열을 큰 값으로 초기화
        Arrays.fill(dp, K + 1);
        //필요한 동전 개수
        dp[0] = 0;

        for (int i = 0; i < N; i++) {
            for (int j = coin[i]; j <= K; j++) {
                dp[j] = Math.min(dp[j], dp[j - coin[i]] + 1);
            }
        }


        if (dp[K] == K + 1) {
            System.out.println(-1);
        } else {
            System.out.println(dp[K]);
        }
    }
}

