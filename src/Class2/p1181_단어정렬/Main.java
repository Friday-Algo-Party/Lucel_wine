package Class2.p1181_단어정렬;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        ArrayList<String> words = new ArrayList<>();

        // 단어 입력
        for (int i = 0; i < N; i++) {
            String word = br.readLine();

            //중복안 경우
            if (!words.contains(word)) {
                words.add(word);
            }
        }

        // 정렬하기(알려준대로 함)
        Collections.sort(words, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if (s1.length() != s2.length()) {
                    // 길이가 다르면 길이순 정렬
                    return s1.length() - s2.length();
                } else {
                    // 길이가 같으면 사전순 정렬
                    return s1.compareTo(s2);
                }
            }
        });

        for (String word : words) {
            System.out.println(word);
        }
    }
}