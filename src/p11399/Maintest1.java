package p11399;
import java.io.*;
import java.util.*;

public class Maintest1  {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }


        //배열 정리 하기 위해 사용한것 - 얘도 가능
        //Arrays.sort(arr);

        int[] sortedArr = Arrays.stream(arr).sorted().toArray();

        //시간의 합의 최솟값
        int sum = 0;

        for(int i=0; i < N; i++) {
            if(i>0) {
                sortedArr[i] += sortedArr[i-1];
            }
            sum += sortedArr[i];
        }
        System.out.println(sum);
    }
}
