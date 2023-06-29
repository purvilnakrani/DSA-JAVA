package Backtracking;

import java.util.*;

public class MazeProblemPrintMatrixAndPaths {
    public static void main(String[] args) {
        boolean[][] maze = {{true, true, true},
                {true, true, true},
                {true, true, true}};
        int[][] arr = new int[maze.length][maze[0].length];
        matrixAndPaths(maze, "", 0, 0, arr, 1);
    }

    static void matrixAndPaths(boolean[][] maze, String p, int r, int c, int[][] arr, int step) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            arr[r][c] = step;
            for (int[] a : arr) {
                System.out.println(Arrays.toString(a));
            }
            System.out.println(p);

            return;
        }
        if (!maze[r][c]) return;

        maze[r][c] = false;
        arr[r][c] = step;

        if (r < maze.length - 1) {
            matrixAndPaths(maze, p + 'D', r + 1, c, arr, step + 1);
        }
        if (c < maze[0].length - 1) {
            matrixAndPaths(maze, p + 'R', r, c + 1, arr, step + 1);
        }
        if (r > 0) {
            matrixAndPaths(maze, p + 'U', r - 1, c, arr, step + 1);
        }
        if (c > 0) {
            matrixAndPaths(maze, p + 'L', r, c - 1, arr, step + 1);
        }
        maze[r][c] = true;
        arr[r][c] = 0;
    }
}
