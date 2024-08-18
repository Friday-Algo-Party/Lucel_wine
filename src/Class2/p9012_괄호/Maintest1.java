package Class2.p9012_괄호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Maintest1 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        String[] sentences = new String[t];

        for (int i = 0; i < t; i++) {
            sentences[i] = br.readLine();
        }

        for (int i = 0; i < t; i++) {
            checkValid(sentences[i]);
        }
    }

    private static void checkValid(String sentence) {
        char[] check = new char[sentence.length()];
        int top = -1;

        for (char ch : sentence.toCharArray()) {
            if (ch == '(') {
                //여는 괄호시 일단 배열에 계속 추가
                check[++top] = ch;
            } else if (ch == ')') {
                //여는 괄호 없이 닫는 괄호만 있는 경우
                if (top == -1) {
                    System.out.println("NO");
                    return;
                }
                // 닫는 괄호가 나왔으므로 스택에서 제거
                top--;
            }
        }

        System.out.println(top == -1 ? "YES" : "NO");
    }
}
