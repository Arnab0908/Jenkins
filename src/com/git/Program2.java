package com.git;

import java.util.Scanner;

public class  Program2{
	 static void explore(char[][] grid, int r, int c) {

	        if (r < 0 || c < 0 || r >= grid.length || c >= grid[0].length)
	            return;

	        if (grid[r][c] == '0')
	            return;

	        grid[r][c] = '0'; 
	        explore(grid, r + 1, c);
	        explore(grid, r - 1, c);
	        explore(grid, r, c + 1);
	        explore(grid, r, c - 1);
	    }


	    static int countIslands(char[][] grid) {

	        int islands = 0;

	        for (int i = 0; i < grid.length; i++) {
	            for (int j = 0; j < grid[0].length; j++) {

	                if (grid[i][j] == '1') {
	                    islands++;
	                    explore(grid, i, j);
	                }

	            }
	        }

	        return islands;
	    }

	    public static void main(String[] args) {

	        Scanner input = new Scanner(System.in);

	        int rows = input.nextInt();
	        int cols = input.nextInt();

	        char[][] grid = new char[rows][cols];

	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                grid[i][j] = input.next().charAt(0);
	            }
	        }

	        int result = countIslands(grid);
	        System.out.println(result);

	        input.close(); 
	    }
}
