package Class3.p2602_바이러스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int N, M;
    static List<Integer>[] graph;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //정점의 개수
        N = Integer.parseInt(br.readLine());
        //간선의 개수
        M = Integer.parseInt(br.readLine());


        //각 노드에 연결된 노드들
        graph = new ArrayList[N + 1];

        //방문한거
        visited = new boolean[N + 1];


        //그래프
        for (int i = 0; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        //양방향 연결
        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph[a].add(b);
            graph[b].add(a);
        }

        // 1번 컴퓨터에서 시작
        System.out.println(bfs(1));
    }

    static int bfs(int a) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(a);
        visited[a] = true;

        int count = 0;

        while (!queue.isEmpty()) {
            int cur = queue.poll();
            count++;

            for (int neighbor : graph[cur]) {
                if (!visited[neighbor]) {
                    queue.offer(neighbor);
                    visited[neighbor] = true;
                }
            }
        }

        return count - 1; // 1번 제외
    }
}
