package Class2.p2869_달팽이는올라가고싶다;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        //아침 올라가기
        int morning = Integer.parseInt(st.nextToken());

        //저녁 - 내려가기
        int sleep = Integer.parseInt(st.nextToken());

        //총 높이
        int height = Integer.parseInt(st.nextToken());

        //날짜
        //마지막 날의 저녁에 도착하는 경우는 내려가서 안됨 따라서 sleep을 빼줘야함
        //int day = (height)/(morning-sleep);
        int day = (height-sleep)/(morning-sleep);


        if ((height-sleep)%(morning-sleep) != 0)
            day++;

        System.out.println(day);
    }
}

