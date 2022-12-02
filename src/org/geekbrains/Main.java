package org.geekbrains;

import java.util.Arrays;
import java.util.List;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        int[][] grid = {{0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                        {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
                        {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}
        };

//        int[][] grid = {
//                  {1,1,0,0,0},
//                  {1,1,0,0,0},
//                  {0,0,0,1,1},
//                  {0,0,0,1,1}
//        };

//  ДЗ1
        Hw1 Sol = new Hw1();
        int maxArea = Sol.maxAreaOfIsland(grid);
        out.println(maxArea);
        for (int[] ints : grid){
            out.println(Arrays.toString(ints));
        }
//  ДЗ2
        int [][] srcImg = {
                {1, 1, 1},
                {1, 1, 0},
                {1, 0, 1}
        };
        int sr = 1;
        int sc = 1;
        int color = 2;

        out.println("\n");
        for (int[] ints : srcImg){
            out.println(Arrays.toString(ints));
        }

        Hw2 fill = new Hw2();
        int[][] dstImg = fill.floodFill(srcImg, sr, sc, color);

        out.println("\n");
        for (int[] ints : dstImg){
            out.println(Arrays.toString(ints));
        }
//ДЗ3
        TreeNode root = new TreeNode(1) ;
        Hw3 sol = new Hw3();
        List<String> resList = sol.binaryTreePaths(root);
        out.println("\n");
        out.println(resList);
//ДЗ4

    }


}
