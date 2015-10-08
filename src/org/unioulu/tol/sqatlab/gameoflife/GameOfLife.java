package org.unioulu.tol.sqatlab.gameoflife;

import java.util.Arrays;

public class GameOfLife {
	
	public void Logic()
	{
		int[][] GottenGrid;
		Grid GOLGrid = new Grid();
		GottenGrid = GOLGrid.DefineGrid();
		
		for(int x = 0; x < 50; x++)
		{
			for(int y = 0; y < 50; y++)
			{			
				System.out.println(GottenGrid[x][y])
			}
		
		}
		//System.out.println(Arrays.deepToString(GottenGrid));
	}
}
