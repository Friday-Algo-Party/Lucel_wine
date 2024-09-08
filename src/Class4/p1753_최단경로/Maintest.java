package Class4.p1753_최단경로;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Maintest {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 정점의 개수
        int V = Integer.parseInt(st.nextToken());

        // 간선의 개수
        int E = Integer.parseInt(st.nextToken());

        // 시작
        int K = Integer.parseInt(br.readLine());

        // 그래프 초기화
        int[][] graph = new int[V + 1][V + 1];
        for (int i = 1; i <= V; i++) {
            for (int j = 1; j <= V; j++) {
                if (i != j) {
                    graph[i][j] = 300000;
                }
            }
        }

        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            //graph[u][v] = ...?
        }
    }

    //도저히 모르겠다..
}