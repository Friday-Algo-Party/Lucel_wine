package Class3.p2667_단지번호붙이기;

import java.io.*;
import java.util.*;

//Readme 작성해볼것
public class Main {

    // 지도 가로 세로 길이
    static int N;

    // 지도
    static int[][] map;

    // 방문 여부
    static boolean[][] visited;

    //단지 전체 개수
    static int[] totalN;

    //발견한 단지의 수
    static int countN = 0;

    static int[] dx = {-1, 1, 0, 0}; // 상하좌우 이동
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        visited = new boolean[N][N];
        totalN = new int[N * N];

        // 지도 0 1 입력
        for (int i = 0; i < N; i++) {
            String line = br.readLine();

            for (int j = 0; j < N; j++) {
                //정수로 변환(아스키)
                map[i][j] = line.charAt(j) - '0';
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] == 1 && !visited[i][j]) {
                    totalN[countN++] = bfs(i, j);
                }
            }
        }

        // 단지 집의 수 오름차순 정렬 - 문제에 있음
        Arrays.sort(totalN, 0, countN);

        // 단지 수 및 각 단지 크기 출력
        System.out.println(countN);
        for (int i = 0; i < countN; i++) {
            System.out.println(totalN[i]);
        }
    }

    // BFS로 단지 크기 구하기
    public static int bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x, y});
        visited[x][y] = true;

        //현재단지
        int count = 1;

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int cx = cur[0];
            int cy = cur[1];

            // 집 탐색 하기
            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if (nx >= 0 && nx < N && ny >= 0 && ny < N && !visited[nx][ny] && map[nx][ny] == 1) {
                    queue.offer(new int[]{nx, ny});
                    visited[nx][ny] = true;
                    count++;
                }
            }
        }
        return count; // 단지 크기 반환
    }
}
