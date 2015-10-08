package org.unioulu.tol.sqatlab.gameoflife;
import java.util.Random;

public class Grid 
{
	public int[][] DefineGrid()
	{
		Random randomGenerator = new Random();
		int[][] grid = new int[50][50];
		for(int x = 0; x < 50; x++)
		{
			for(int y = 0; y < 50; y++)
			{			
				grid[x][y] = randomGenerator.nextInt(1);
			}
		
		}
	return grid;
	}
}
