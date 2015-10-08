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
				int temp_xStart =x -1;
				int temp_xEnd = x +1;
				int temp_yStart =y -1;
				int temp_yEnd = y +1;
				
					for(temp_xStart= x-1; temp_xStart < temp_xEnd && temp_xStart < 50 && temp_xStart >= 0; temp_xStart++)
					{
						for(temp_yStart= y-1; temp_yStart < temp_yEnd && temp_yStart < 50 && temp_yStart >= 0; temp_yStart++)
						{				
							if(GottenGrid[temp_x][temp_y] == 1/* && ((temp_x != x && temp_y == y) || (temp_y != y && temp_x == x))*/)
							{
								tempNeighbors++;
							}
						}
					}
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
