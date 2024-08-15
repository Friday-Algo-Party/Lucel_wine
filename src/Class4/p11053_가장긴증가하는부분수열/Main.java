package Class4.p11053_가장긴증가하는부분수열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 수열의 각 요소들을 입력받아서 배열에 저장
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 가장 긴 증가하는 부분 수열의 길이를 저장할 배열
        int[] dp = new int[N];
        int max = 0;

        // 가장 긴 증가하는 부분 수열의 길이 구하기
        for (int cur = 0; cur < N; cur++) {
            dp[cur] = 1; // 각 위치에서 최소 길이는 1입니다 (자신만 포함)
            for (int prev = 0; prev < cur; prev++) {
                //현재 있는값이 예전 있는 값보다 큰경우
                if (arr[cur] > arr[prev]) {
                    dp[cur] = Math.max(dp[cur], dp[prev] + 1);
                }
            }
            max = Math.max(max, dp[cur]);

            //아래와 같이 하는 경우 마지막 dp[cur] 값으로 설정되기 때문에 실패가 뜸
            //max = dp[cur];
        }

        // 최종적으로 구해진 max 값(= 가장 긴 증가하는 부분 수열의 길이) 출력
        System.out.println(max);
    }
}

