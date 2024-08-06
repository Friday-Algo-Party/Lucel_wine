package p1546;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] preGradeArray = br.readLine().split(" ");
        int[] gradeArray = new int[n]; //성적이 들어간 배열

        for(int i = 0; i < preGradeArray.length; i++){
            gradeArray[i] = Integer.parseInt(preGradeArray[i]);
        }

        Arrays.sort(gradeArray);

        float maxGrade = gradeArray[n - 1];
        float sumGrade = 0;

        for(int j = 0; j < gradeArray.length; j++){
            sumGrade += gradeArray[j] / maxGrade * 100;
        }
        System.out.println(sumGrade / n);
    }
}
