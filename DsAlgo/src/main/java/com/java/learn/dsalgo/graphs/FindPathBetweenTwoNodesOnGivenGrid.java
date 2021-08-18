package com.java.learn.dsalgo.graphs;

import java.util.LinkedList;
import java.util.Queue;

public class FindPathBetweenTwoNodesOnGivenGrid {

    /*
    *       -----------------------------
    *       | S | . | . | # | . | . | . |
    *       | . | # | . | . | . | # | . |
    *       | . | # | . | . | . | . | . |
    *       | . | . | # | # | . | . | . |
    *       | # | . | # | E | . | # | . |
    *       -----------------------------
    *
    * */

    static public class Pair{
        int i;
        int j;
        public Pair(int i,int j){
            this.i = i;
            this.j = j;
        }
    }

    private char[][] grid;
    private boolean[][] visited;
    private Queue<Pair> queue;
    private boolean reached_end;
    private int node_left_in_layer = 1;
    private int nodes_in_next_layer = 0;
    private int moveCount=0;

    public FindPathBetweenTwoNodesOnGivenGrid(){
        this.grid = constructGraph();
        visited = new boolean[grid.length][grid[0].length];
        queue = new LinkedList<>();
    }

    private char[][] constructGraph(){
        char[][] grid= new char[5][7];
        for(int i=0;i<5;i++){
            for(int j=0;j<7;j++){
                grid[i][j] = '.';
            }
        }

        grid[0][0] = 'S';
        grid[0][3] = '#';
        grid[1][1] = '#';
        grid[1][5] = '#';
        grid[2][1] = '#';
        grid[3][2] = '#';
        grid[3][3] = '#';
        grid[4][0] = '#';
        grid[4][2] = '#';
        grid[4][3] = 'E';
        grid[4][5] = '#';
        return grid;
    }
    public static void main(String[] args) {

        FindPathBetweenTwoNodesOnGivenGrid graph = new FindPathBetweenTwoNodesOnGivenGrid();
        int moves = graph.solve(0,0);
        System.out.println(moves);

    }

    private int solve(int r, int c) {

        queue.offer(new Pair(r,c));
        visited[r][c] = true;
        while(!queue.isEmpty()){
            Pair pair = queue.poll();
            int rr = pair.i;
            int cc = pair.j;
            if(grid[rr][cc] == 'E'){
                reached_end = true;
                break;
            }

            exploreNeibours(rr,cc);
            node_left_in_layer--;
            if(node_left_in_layer == 0){
                node_left_in_layer = nodes_in_next_layer;
                nodes_in_next_layer = 0;
                moveCount++;
            }


        }
        if(reached_end)
            return moveCount;
        else
            return -1;

    }

    private void exploreNeibours(int r, int c) {

        int[] dr = {-1,1,0,0};
        int[] dc = {0,0,-1,1};
        for(int i=0;i<4;i++){
            int rr = r + dr[i];
            int cc = c + dc[i];

            if(rr < 0 || cc < 0)
                continue;

            if(rr >= grid.length || cc >= grid[0].length)
                continue;

            if(grid[rr][cc] == '#')
                continue;

            if(grid[rr][cc] == 'E') {
                reached_end = true;
                return;
            }

            if(visited[rr][cc])
                continue;;

            visited[rr][cc] = true;
            nodes_in_next_layer++;
            queue.offer(new Pair(rr,cc));

        }
    }

}
