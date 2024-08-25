package Class3.p2178_미로탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    // 행 과 열
    static int N, M;

    // 미로의 상태
    static int[][] arr;
    // 방문 여부
    static boolean[][] visit;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());


        N = Integer.parseInt(st.nextToken());

        M = Integer.parseInt(st.nextToken());


        arr = new int[N][M];

        visit = new boolean[N][M];

        // 미로의 정보를 입력받음
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++) {
                // 각 위치에 0 또는 1의 값이 저장됨
                arr[i][j] = str.charAt(j) - '0';
            }
        }

        // BFS를 통해 최단 경로 계산
        bfs();

        // 도착점 (N-1, M-1)에서의 값을 출력
        System.out.println(arr[N-1][M-1]);
    }

    static void bfs() {

        // 상하좌우로 이동하기 위한 방향 배열
        int[] dr = {-1, 1, 0, 0}; // 행 이동
        int[] dc = {0, 0, 1, -1}; // 열 이동

        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        // 시작점 (0, 0)을 큐에 추가하고 방문 표시
        q1.offer(0);
        q2.offer(0);
        visit[0][0] = true;

        // 큐가 빌 때까지 반복
        while (!q1.isEmpty()) {

            // 현재 위치를 큐에서 꺼냄
            int i = q1.poll();
            int j = q2.poll();

            // 네 방향(상하좌우)으로 이동을 시도
            for (int a = 0; a < 4; a++) {
                int nr = i + dr[a]; // 다음 행 위치
                int nc = j + dc[a]; // 다음 열 위치

                // 다음 위치가 미로 범위 내에 있는지 확인
                if (nr >= 0 && nc >= 0 && nr < N && nc < M) {
                    // 이동할 수 있고, 아직 방문하지 않은 칸이라면
                    if (arr[nr][nc] == 1 && !visit[nr][nc]) {
                        q1.offer(nr);
                        q2.offer(nc);

                        // 방문 표시
                        visit[nr][nc] = true;

                        arr[nr][nc] = arr[i][j] + 1;
                    }
                }
            }
        }
    }
}
