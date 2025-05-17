import java.util.*;

class StackDFS {
    public static void main(String[] args) {
        int[][] adj = {
            {0, 1, 1, 0, 0},
            {1, 0, 0, 1, 1},
            {1, 0, 0, 0, 0},
            {0, 1, 0, 0, 0},
            {0, 1, 0, 0, 0}
        };

        int n = adj.length; 
        boolean[] visited = new boolean[n];
        Stack<Integer> stack = new Stack<>();

        int start = 0; 
        stack.push(start);

        System.out.print("DFS Traversal: ");
        while (!stack.isEmpty()) {
            int curr = stack.pop();

            if (!visited[curr]) {
                visited[curr] = true;
                System.out.print(curr + " ");

                for (int i = n - 1; i >= 0; i--) {
                    if (adj[curr][i] == 1 && !visited[i]) {
                        stack.push(i);
                    }
                }
            }
        }
    }
}
