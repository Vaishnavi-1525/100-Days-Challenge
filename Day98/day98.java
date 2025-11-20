import java.util.*;

public class day98 {

    // Check if we can assign color c to vertex node
    static boolean isSafe(int node, int[][] graph, int[] color, int n, int c) {
        for (int i = 0; i < n; i++) {
            if (graph[node][i] == 1 && color[i] == c) {
                return false;
            }
        }
        return true;
    }

    // Backtracking function
    static boolean solve(int node, int[][] graph, int m, int[] color, int n) {
        if (node == n)
            return true;

        for (int c = 1; c <= m; c++) {
            if (isSafe(node, graph, color, n, c)) {
                color[node] = c;

                if (solve(node + 1, graph, m, color, n))
                    return true;

                color[node] = 0; // backtrack
            }
        }

        return false;
    }

    // Main function that returns 1 if possible else 0
    static int graphColoring(int[][] graph, int m, int n) {
        int[] color = new int[n];
        return solve(0, graph, m, color, n) ? 1 : 0;
    }

    public static void main(String[] args) {
        // Example 1
        int n1 = 4, m1 = 3;
        int[][] graph1 = {
                {0, 1, 1, 1},
                {1, 0, 1, 0},
                {1, 1, 0, 1},
                {1, 0, 1, 0}
        };
        System.out.println(graphColoring(graph1, m1, n1)); // Output: 1

        // Example 2
        int n2 = 3, m2 = 2;
        int[][] graph2 = {
                {0, 1, 1},
                {1, 0, 1},
                {1, 1, 0}
        };
        System.out.println(graphColoring(graph2, m2, n2)); // Output: 0
    }
}
