package Class2.p2292_벌집;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

public class Maintest {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int result =1;
        for (int i = 1; i <N ; i++) {

            if(N <= 1 + 3 * i *(i-1)) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}