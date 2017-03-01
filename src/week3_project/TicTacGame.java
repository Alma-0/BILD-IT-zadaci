package week3_project;

public class TicTacGame {
	char[][] table = new char[3][3];

	public void initializeGame() {
		for (int i = 0; i < 3; i++)
			for (int p = 0; p < 3; p++)
				table[i][p] = ' ';
	}

	// Provjera da li je polje vec popunjeno
	public boolean checkIfLegal(int row, int column) {
		if ((row > 2 || column > 2) || (row < 0 || column < 0))
			return true;

		else if (table[row][column] == 'x' || table[row][column] == 'o')
			return true;

		return false;
	}

	public void changeBoard(char player, int row, int column) {
		table[row][column] = player;

	}

	public void displayBoard() {

		System.out.println("  0  " + table[0][0] + "|" + table[0][1] + "|" + table[0][2]);
		System.out.println("    --+-+--");
		System.out.println("  1  " + table[1][0] + "|" + table[1][1] + "|" + table[1][2]);
		System.out.println("    --+-+--");
		System.out.println("  2  " + table[2][0] + "|" + table[2][1] + "|" + table[2][2]);
		System.out.println("     0 1 2 ");
	}

	public char changePlayer(char player) {
		char newTurn = 'e';
		if (player == 'o')
			newTurn = 'x';
		if (player == 'x')
			newTurn = 'o';
		return newTurn;
	}

	public boolean checkIfWinner() {
		// Provjera da li je korisnik pobijedio
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (table[i][j] == table[1][j] && table[1][j] == table[2][j]
						&& (table[i][j] == 'x' || table[i][j] == 'o'))
					return true;

				else if (table[j][i] == table[j][1] && table[j][1] == table[j][2]
						&& (table[j][i] == 'x' || table[j][i] == 'o'))
					return true;
				else if (table[0][0] == table[1][1] && table[1][1] == table[2][2]
						&& (table[0][0] == 'x' || table[0][0] == 'o'))
					return true;
				else if (table[2][0] == table[1][1] && table[1][1] == table[0][2]
						&& (table[2][0] == 'x' || table[2][0] == 'o'))
					return true;

			}
		}

		return false;
	}

	// Provjera da li je rezultat nerijesen
	public boolean checkIfTie() {
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++)
				if (table[i][j] == ' ')
					return false;

		return true;
	}

}
