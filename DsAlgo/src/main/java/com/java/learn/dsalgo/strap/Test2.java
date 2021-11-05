package com.java.learn.dsalgo.strap;

public class Test2 {
    public static void main(String[] args) {
        int[][] matrix = {{0,1,-1},{1,0,-1},{1,1,1}};
        boolean[][] visited = new boolean[3][3];
        int max = maxCollect(matrix, visited, 0 ,0,"");
        System.out.println(max);
    }

    private static int maxCollect(int[][] matrix, boolean[][] visited, int i, int i1, String s) {

        return movetoptobottom(matrix,visited,i,i1,s) + bottomtotop(matrix,visited,i,i1,s);
    }

    static public int movetoptobottom(int[][] matrix,boolean[][] visited, int i,int j, String asf){

        if(i < 0 || j < 0 || i >= matrix.length || j >= matrix[0].length || matrix[i][j] == -1 || visited[i][j] == true){
            return 0;
        }

        System.out.print("("+i+","+j+") ");

        visited[i][j] = true;

        int count = 0;
        if(matrix[i][j] == 1) {
            count = count + 1;
            matrix[i][j] = 0;
        }

        int c2 = movetoptobottom(matrix, visited, i, j+1,asf+i+" "+j+" "); // move right;
        int c1 = movetoptobottom(matrix,visited,i+1,j, asf+i+" "+j+" "); // move down
        visited[i][j] = false;
        return c1+c2+count;
    }

    static public int bottomtotop(int[][] matrix,boolean[][] visited, int i,int j, String asf){

        if(i < 0 || j < 0 || i >= matrix.length || j >= matrix[0].length || matrix[i][j] == -1 || visited[i][j] == true){
            return 0;
        }

        System.out.print("("+i+","+j+") ");

        visited[i][j] = true;

        int count = 0;
        if(matrix[i][j] == 1) {
            count = count + 1;
            matrix[i][j] = 0;
        }


        int c4 = bottomtotop(matrix, visited, i, j-1,asf+i+" "+j+" "); // move left
        int c3 = bottomtotop(matrix,visited,i-1,j,asf+i+" "+j+" "); // move up


        return count+c3+c4;
    }
}
   //     [1,  0,  1]
    //    [1,  0, -1]
     //   [1,  1,  1]