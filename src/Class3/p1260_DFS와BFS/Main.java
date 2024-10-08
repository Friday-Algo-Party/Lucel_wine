package Class3.p1260_DFS와BFS;
import java.io.*;
import java.util.*;

public class Main {
    //DFS
    static int[][] Dgraph = new int[1001][1001];
    //BFS
    static int[][] Bgraph = new int[1001][1001];


    static boolean[] Dvisit = new boolean[10001];
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            Dgraph[u][v] = Dgraph[v][u] = 1;
            Bgraph[u][v] = Bgraph[v][u] = 1;
        }
        DFS(V);
        System.out.println();
        BFS(V);
    }

    public static void DFS(int node) {
        Dvisit[node] = true;
        System.out.print(node + " ");

        for(int i = 1; i <= N; i++) {
            if(!Dvisit[i] && Dgraph[node][i] == 1) {
                DFS(i);
            }
        }
    }

    //Queue랑 ArrayList 그리고 알고리즘 작동 방식 다시 공부 할것
    public static void BFS(int node) {
        boolean[] Bvisit = new boolean[10001];
        Queue<Integer> que = new LinkedList<Integer>();
        Bvisit[node] = true;
        que.offer(node);

        while(!que.isEmpty()) {
            int P = que.poll();
            System.out.print(P + " ");

            for(int i = 1; i <= N; i++) {
                if(!Bvisit[i] && Bgraph[P][i] == 1) {
                    Bvisit[i] = true;
                    que.offer(i);
                }
            }
        }
    }

}
