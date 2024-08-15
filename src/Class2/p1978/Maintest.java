package Class2.p1978;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Maintest {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int count = 0;
        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());

            // 소수인경우 true, 아닌경우 false
            boolean check = true;

            //1은 넘김
            if (num == 1) {
                continue;
            }

            //2부터
            for (int j = 2; j <= Math.sqrt(num); j++) {
                if (num % j == 0) {
                    //한번이라도  false가 나오면 그건 소수가 아님
                    check = false;
                }

            }
            if (check) { //check가 true이면 소수이다 count에 누적시켜준다
                count++;
            }
        }
        System.out.println(count); //소수 개수 출력
    }

}
