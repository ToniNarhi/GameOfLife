package org.unioulu.tol.sqatlab.gameoflife;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)
	{
		GameOfLife GOL = new GameOfLife();
		char quit = 'a';
		
		Scanner reader = new Scanner(System.in);
		do
		{
		GOL.Logic();
		
		quit = reader.next().charAt(0);
		}while(quit != 'q');
	}
}