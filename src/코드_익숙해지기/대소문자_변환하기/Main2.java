package 코드_익숙해지기.대소문자_변환하기;

import java.util.*;

//두번쨰 방법
class Main2 {
    public String solution(String str){
        String answer="";
        for(char x : str.toCharArray()){
            if(x>=97 && x<=122) answer+=(char)(x-32);
            else answer+=(char)(x+32);
        }
        return answer;
    }

    public static void main(String[] args){
        Main2 T = new Main2();
        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        System.out.print(T.solution(str));
    }
}
