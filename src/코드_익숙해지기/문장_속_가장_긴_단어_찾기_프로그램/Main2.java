package 코드_익숙해지기.문장_속_가장_긴_단어_찾기_프로그램;

import java.util.*;

//두번째 방법
class Main2 {
    public String solution(String str){
        String answer="";
        int m=Integer.MIN_VALUE;
        String[] s = str.split(" ");
        for(String x : s){
            int len=x.length();
            if(len>m){
                m=len;
                answer=x;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Main2 T = new Main2();
        Scanner kb = new Scanner(System.in);
        String str=kb.nextLine();
        System.out.print(T.solution(str));
    }
}