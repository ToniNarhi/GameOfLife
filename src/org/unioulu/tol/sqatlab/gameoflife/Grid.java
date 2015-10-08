package org.unioulu.tol.sqatlab.gameoflife;

public class Grid 
{
	public int[][] DefineGrid()
	{
		int[][] grid = new int[50][50];
		for(int x = 0; x < 50; x++)
		{
			for(int y = 0; y < 50; y++)
			{			
				grid[x][y] = 0;
			}
		
		}
	return grid;
	}
}
