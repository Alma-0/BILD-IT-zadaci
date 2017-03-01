package week3_project;

import java.util.Scanner;

import userInput.InputSingleNumber;

public class TicTac {

	int row = 3;
	char board[][] = new char[row][row];

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Do you want to play? 1 for yes, 2 for no ");
		int play = InputSingleNumber.inputNumber(input, 1, 2);

		if (play != 1) {
			System.out.print("Bye");
			System.exit(0);
		}

		char player = 'o';
		int row, column;
		TicTacGame game = new TicTacGame();

		game.initializeGame();
		System.out.println("Game ready !\n");

		while (true) {
			player = game.changePlayer(player);
			//Unos polja
			System.out.print("\n" + player + " ,choose your location (row, column) [0,2]:");
			row = InputSingleNumber.inputNumber(input, 0, 2);
			column = InputSingleNumber.inputNumber(input, 0, 2);
			// Provjera da li je uneseno polje vec popunjeno
			
			while (game.checkIfLegal(row, column)) {
				System.out.println("That slot is already taken, please try again (row, column).");
				game.displayBoard();
				row = InputSingleNumber.inputNumber(input, 0, 2);
				column = InputSingleNumber.inputNumber(input, 0, 2);
			}
			game.changeBoard(player, row, column);
			game.displayBoard();
			// Provjera da li je igrac pobijedio ili je rezultat nerijesen
			// (ispis poruke)
			if (game.checkIfWinner()) {
				System.out.println("\nThe winner is " + player + " !");
				break;

			}
			if (game.checkIfTie()) {
				System.out.println("\nThe game is a tie !");
				break;
			}
		}

	}

}
