package Class3.p2178_미로탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Maintest {

    static int N, M, V;
    static List<Integer>[] graph;
    static boolean[] visited;

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());

        M = Integer.parseInt(st.nextToken());

        V = Integer.parseInt(st.nextToken());


        graph = new ArrayList[N + 1];

        for (int i = 0; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }


        bfs();


    }
    static void bfs() {
        Queue<Integer> queue = new LinkedList<>();
        // 큐에 탐색을 시작할 정점을 넣고 방문처리 후 시작
        queue.offer(V);
        visited[V] = true;

        while(!queue.isEmpty()) {
            // 큐에서 나오는 순서가 노드를 방문한 순서
            int cur = queue.poll();
            sb.append(cur + " ");

            // 현재 노드 cur에 연결된 노드들이 아직 방문 전이라면 큐에 넣고 방문 처리
            for (Integer next : graph[cur]) {
                if (!visited[next]) {
                    queue.offer(next);
                    visited[next] = true;
                }
            }

        }
    }
}


