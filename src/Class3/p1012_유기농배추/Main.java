package Class3.p1012_유기농배추;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    static int M; // 배추밭의 가로 길이
    static int N; // 배추밭의 세로 길이
    static int[][] map;
    static boolean[][] visited;

    static int[] dx = {-1, 1, 0, 0}; // 상하좌우 이동
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 수

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            String[] input = br.readLine().split(" ");
            M = Integer.parseInt(input[0]); // 가로 길이
            N = Integer.parseInt(input[1]); // 세로 길이
            int K = Integer.parseInt(input[2]); // 배추 위치 개수

            map = new int[M][N];
            visited = new boolean[M][N];

            // 지도 입력
            for (int k = 0; k < K; k++) {
                input = br.readLine().split(" ");
                int x = Integer.parseInt(input[0]);
                int y = Integer.parseInt(input[1]);
                map[x][y] = 1; // 배추 위치 표시
            }

            int wormCount = 0;

            // 지도 탐색
            for (int j = 0; j < M; j++) {
                for (int k = 0; k < N; k++) {
                    if (map[j][k] == 1 && !visited[j][k]) {
                        bfs(j, k);
                        wormCount++;
                    }
                }
            }

            // 결과 저장
            sb.append(wormCount).append("\n");
        }

        // 결과 출력
        System.out.print(sb.toString());
    }

    // BFS를 사용하여 단지 크기 구하기
    public static void bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x, y});
        visited[x][y] = true;

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int cx = cur[0];
            int cy = cur[1];

            // 상하좌우 탐색
            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if (nx >= 0 && nx < M && ny >= 0 && ny < N && !visited[nx][ny] && map[nx][ny] == 1) {
                    queue.offer(new int[]{nx, ny});
                    visited[nx][ny] = true;
                }
            }
        }
    }
}
