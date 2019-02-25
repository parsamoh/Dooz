package dooz;

import java.util.Scanner;

public class Dooz {

	static int [][] boardArray = new int [3][3];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to my game!!!");
		runGame();
				
	}
	public static void runGame() {
		// TODO Auto-generated method stub
		int turn = 0;
		while(true)
		{
			drawBoard();
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Please enter the row number:");
			int r = scanner.nextInt();
			
			System.out.println("Please enter the column number:");
			int c = scanner.nextInt();
			boardArray[r-1][c-1] = turn+1;
			turn = 1 - turn;
		}
	}
	public static void drawRow(int row) {	
		for(int i=0; i<3;i++) {
			System.out.print("|     |");
		}
		System.out.println();
		
		for(int i=0; i<3;i++) {
			if(boardArray[row][i] == 1) {
				System.out.print("|  X  |");
			}
			else if(boardArray[row][i] == 2) {
				System.out.print("|  O  |");
			}
			else {
				System.out.print("|     |");
			}
		}
		System.out.println();
		
		for(int i=0; i<3;i++) {
			System.out.print("|_____|");
		}
		System.out.println();
	}
	public static void drawHead() {
		for(int i=0; i<3;i++) {
			System.out.print(" _____ ");
		}
		System.out.println();		
	}
	public static void drawBoard() {
		drawHead();
		for(int i=0; i<3; i++) {
			drawRow(i);
		}
	}
}
