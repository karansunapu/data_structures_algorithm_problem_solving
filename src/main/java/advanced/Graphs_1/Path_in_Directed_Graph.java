package advanced.Graphs_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Path_in_Directed_Graph {
    public static void main(String[] args) {
        int A = 5;
        int[][] input = { {1, 4},  {2, 1},  {4, 3},  {4, 5},  {2, 3},  {2, 4},
                        {1, 5},  {5, 3},  {2, 5},  {5, 1},  {4, 2},  {3, 1},  {5, 4},
                        {3, 4},  {1, 3},  {4, 1},  {3, 5},  {3, 2},  {5, 2}  };
        ArrayList<ArrayList<Integer>> B = new ArrayList<ArrayList<Integer>>();
//        {
//            {
//                add( new ArrayList<>(Arrays.asList(1,2)));
//            }
//        };

        for (int i=0; i<input.length; i++){
            B.add(new ArrayList<>(Arrays.asList(input[i][0],input[i][1])));
        }


        System.out.println(solve(A, B));
    }

    public static int solve(int A, ArrayList<ArrayList<Integer>> B) {

        ArrayList<Integer>[] graph = new ArrayList[A+1];
        for (int i=0; i<A+1; i++)
            graph[i] = new ArrayList<>();

        for (int i=0; i<B.size(); i++){
            graph[B.get(i).get(0)].add(B.get(i).get(1));
        }

        System.out.println(Arrays.deepToString(graph));

        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[A+1];

        queue.add(1);   visited[1]=true;

        while (! queue.isEmpty()){
            int u = queue.remove();
            for (int i=0; i<graph[u].size(); i++){
                int v = graph[u].get(i);
                if (v == A)
                    return 1;
                if (!visited[v]){
                    queue.add(v);
                    visited[v] = true;
                }
            }
        }

        return 0;
    }
}
