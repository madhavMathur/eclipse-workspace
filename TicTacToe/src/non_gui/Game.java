package non_gui;

import java.util.Scanner;

public class Game {
	static Scanner in = new Scanner(System.in);
	static char[][] board = new char[3][3];
	static char currentTurn;
	static char winner = ' ';
	static int row, col;
	
	private static void startGame() {
		System.out.println(">>WELCOME TO MADHAV'S TICTACTOE!<<\n");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				board[i][j] = '-';
			}
		}
		currentTurn = 'X';
		winner = ' ';
		printBoard();
	}
	
	public static void main(String[] args) {
		startGame();
		while(!checkWin()) {
			playGame();
			printBoard();
		}
		if(winner == 'X') 
			System.out.println(">> X Wins! <<"); 
		else if(winner == 'O') 
			System.out.println(">> O Wins! <<");
		else 
			System.out.println(">> Draw! <<");
	}

	private static void printBoard() {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print("| " + board[i][j] + " |");
			}
			System.out.println();
		}
	}

	private static boolean checkWin() {
		//check rows
		for(int i = 0; i < 3; i++) {
			if((board[i][0] == board[i][1] && board[i][0] == board[i][2]) && board[i][0] != '-') {
				winner = board[i][0];
				return true;
			}
		}
		
		//check cols
		for(int i = 0; i < 2; i++) {
			if((board[0][i] == board[1][i] && board[0][i] == board[2][i]) && board[0][i] != '-') {
				winner = board[0][i];
				return true;
			}
		}
		
		//check diagonals
		if((board[0][0] == board[1][1] && board[0][0] == board[2][2]) && board[0][0] != '-') {
			winner = board[0][0];
			return true;
		} else if((board[2][0] == board[1][1] && board[2][0] == board[0][2]) && board[2][0] != '-') {
			winner = board[2][0];
			return true;
		}
		
		boolean flag = false;
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(board[i][j] == '-') {
					flag = true;
				}
			}
		}
		if (!flag) {
			winner = 'd'; 
			return true;
		}
		return false;
	}

	private static void playGame() {
		System.out.println(">> "+ currentTurn + "'s turn! <<");
		System.out.println("Enter a row and column (1-3)");
		row = in.nextInt();
		col = in.nextInt();
		
		if(row > 3 || col > 3) {
			System.out.println("\n! INVALID INPUT !");
			printBoard();
			playGame();
		} else {
			board[row - 1][col - 1] = currentTurn;
			if(currentTurn == 'X')
				currentTurn = 'O';
			else
				currentTurn = 'X';
		}
	}
}
