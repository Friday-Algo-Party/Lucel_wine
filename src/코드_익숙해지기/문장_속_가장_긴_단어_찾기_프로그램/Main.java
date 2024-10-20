package 코드_익숙해지기.문장_속_가장_긴_단어_찾기_프로그램;

import java.util.*;

//첫번째 방법
class Main {
    public String solution(String str){
        String answer="";
        int m=Integer.MIN_VALUE, pos;
        while((pos=str.indexOf(' '))!=-1){
            String tmp=str.substring(0, pos);
            int len=tmp.length();
            if(len>m){
                m=len;
                answer=tmp;
            }
            str=str.substring(pos+1);
        }
        if(str.length()>m) answer=str;
        return answer;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str=kb.nextLine();
        System.out.print(T.solution(str));
    }
}
