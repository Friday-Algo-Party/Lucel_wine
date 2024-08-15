package Class2.p2839;

import java.io.*;
import java.util.*;

public class Maintest1 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int num = Integer.parseInt(st.nextToken());

        int count = 0;

        while (num > 0) {
            if (num < 3) {
                System.out.println("-1");
                return;
            }

            if (num % 5 == 0) {
                count += num / 5;
                System.out.println(count);
                return;
            }
            num-=3;
            count++;
        }
        System.out.println(count);
    }
}
