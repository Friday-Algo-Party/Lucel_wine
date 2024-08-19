package Class2.p2292_벌집;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Maintest {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        //2부터 6의 배수씩 증가함(6->12->18...)
        int count = 1;
        //1은 무조건 첫번째이므로 2부터 시작한다.
        int range = 2;

        if (N == 1) {
            System.out.println(1);
        } else {
            while (range <= N) {
                range = range + (count*6);
                count++;
            }
            System.out.println(count);
        }
    }
}
