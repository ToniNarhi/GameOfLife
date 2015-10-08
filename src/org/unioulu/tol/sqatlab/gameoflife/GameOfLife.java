package org.unioulu.tol.sqatlab.gameoflife;

import java.util.Arrays;

public class GameOfLife {
	
	public void Logic()
	{
		int[][] GottenGrid;
		Grid GOLGrid = new Grid();
		GottenGrid = GOLGrid.DefineGrid();
		
		//GottenGrid[25][25] = 1;
		//GottenGrid[25][24] = 1;
		//GottenGrid[25][23] = 1;
		//GottenGrid[24][25] = 1;
		//GottenGrid[23][24] = 1;
		System.out.println("Before!");
		for(int x = 0; x < 50; x++)
		{
			for(int y = 0; y < 50; y++)
			{			
				System.out.print(GottenGrid[x][y]);
			}
			System.out.println();
		}
		
		for(int x = 0; x < 50; x++)
		{
			for(int y = 0; y < 50; y++)
			{			
				int tempNeighbors = 0;
				int runs = 0;
					for(int temp_x = x-1; temp_x <= x+1 && temp_x < 50 && temp_x >= 0; temp_x++)
					{
						for(int temp_y = y-1; temp_y <= y+1 && temp_y < 50 && temp_y >= 0; temp_y++)
						{				
							runs++;
							if(GottenGrid[temp_x][temp_y] == 1 && ((temp_x != x && temp_y == y) || (temp_y != y && temp_x == x)))
							{
								tempNeighbors++;
							}
						}
					}
					//System.out.println("Runs"+ runs);
				//}
				if(GottenGrid[x][y] == 1 && tempNeighbors < 2)
				{					
					System.out.println(GottenGrid[x][y] + "Has" +tempNeighbors + "Neigbors");
					GottenGrid[x][y] = 0;
				}
				
				if(GottenGrid[x][y] == 1 && (tempNeighbors == 2 || tempNeighbors == 3))
				{					
					GottenGrid[x][y] = 1;
				}
				if(GottenGrid[x][y] == 1 && tempNeighbors > 3)
				{					
					GottenGrid[x][y] = 0;
				}
				if(GottenGrid[x][y] == 0 && tempNeighbors == 3)
				{		
					GottenGrid[x][y] = 1;
				}
			}
		}
		System.out.println("After!");
		for(int x = 0; x < 50; x++)
		{
			for(int y = 0; y < 50; y++)
			{			
				System.out.print(GottenGrid[x][y]);
			}
			System.out.println();
		}
		
		/*
		 * 	x-1y-1	y-1	 x+1y-1
		 * 	x-1		 x	 x+1
		 * 	x-1+y	y+1  x+1y+1
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		
		//System.out.println(Arrays.deepToString(GottenGrid));
	}
}
