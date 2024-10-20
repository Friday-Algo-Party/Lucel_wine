package 코드_익숙해지기.대소문자_변환하기;


//첫번째 방법
import java.util.*;
class Main {
    public String solution(String str){
        String answer="";
        for(char x : str.toCharArray()){
            if(Character.isLowerCase(x)) answer+=Character.toUpperCase(x);
            else answer+=Character.toLowerCase(x);

        }
        return answer;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        System.out.print(T.solution(str));
    }
}