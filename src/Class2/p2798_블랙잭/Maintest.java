package Class2.p2798_블랙잭;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Maintest {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] numberArray = new int[n];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            numberArray[i] = Integer.parseInt(st.nextToken());
        }

        int num = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    int sum = numberArray[i] + numberArray[j] + numberArray[k];

                    //합이 m을 넘지 않고
                    //m에서 sum을 뺀거 보다 전에 저장해놓은 값이 작은 경우 sum에 num을 저장한다.
                    if (sum <= m && m - sum < m - num ) {
                        num = sum;
                    }
                }
            }
        }
        System.out.println(num);
    }
}
