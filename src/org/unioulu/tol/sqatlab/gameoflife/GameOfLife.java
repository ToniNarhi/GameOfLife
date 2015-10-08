package org.unioulu.tol.sqatlab.gameoflife;

import java.util.Arrays;

public class GameOfLife {
	
	public void Logic()
	{
		int[][] GottenGrid;
		Grid GOLGrid = new Grid();
		GottenGrid = GOLGrid.DefineGrid();
		
		GottenGrid[25][25] = 1;
		GottenGrid[25][24] = 1;
		GottenGrid[25][23] = 1;
		GottenGrid[25][23] = 1;
		GottenGrid[23][24] = 1;

		for(int x = 0; x < 50; x++)
		{
			for(int y = 0; y < 50; y++)
			{			
				System.out.print(GottenGrid[x][y]);
			}
			System.out.println();
		}
		//System.out.println(Arrays.deepToString(GottenGrid));
	}
}
