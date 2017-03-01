package week3_project;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import userInput.InputSingleNumber;

public class Game {

	private static final char[] players = new char[] { 'R', 'Y' };
	private final int width, height;
	private final char[][] grid;
	private int lastCol = -1, lastTop = -1;

	public Game(int width, int height) {
		this.width = width;
		this.height = height;
		this.grid = new char[height][];
		for (int i = 0; i < height; i++) {
			Arrays.fill(this.grid[i] = new char[width], '.');
		}
	}

	// ispis ploce, ispis promjena u ovisnosti o unesenom polju
	public String toString() {
		return IntStream.range(0, this.width).mapToObj(Integer::toString).collect(Collectors.joining()) + "\n"
				+ Arrays.stream(this.grid).map(String::new).collect(Collectors.joining("\n"));
	}

	// Unos polja, provjera da li je izabrana kololona popunjena
	public void chooseAndDrop(char symbol, Scanner input) {
		do {
			System.out.print("\nPlayer " + symbol + " turn: ");
			int col = InputSingleNumber.inputNumber(input, 0, 6);

			for (int h = this.height - 1; h >= 0; h--) {
				if (this.grid[h][col] == '.') {
					this.grid[this.lastTop = h][this.lastCol = col] = symbol;
					return;
				}
			}

			System.out.println("Column " + col + " is full.");
		} while (true);
	}

	// Provjera da li imamo 4 polja sa istim znakom (horizontalno, vertikalno,
	// dijagonalno)
	public boolean isWinningPlay() {
		if (this.lastCol == -1) {
			throw new IllegalStateException("No move has been made yet");
		}
		char sym = this.grid[this.lastTop][this.lastCol];
		String streak = String.format("%c%c%c%c", sym, sym, sym, sym);
		return contains(this.horizontal(), streak) || contains(this.vertical(), streak)
				|| contains(this.slashDiagonal(), streak) || contains(this.backslashDiagonal(), streak);
	}

	// postavljanje uslova za provjeru horizontalnog pravca
	private String horizontal() {
		return new String(this.grid[this.lastTop]);
	}

	// postavljanje uslova za provjeru vertikalnog pravca
	private String vertical() {
		StringBuilder sb = new StringBuilder(this.height);
		for (int h = 0; h < this.height; h++) {
			sb.append(this.grid[h][this.lastCol]);
		}
		return sb.toString();
	}

	// postavljanje uslova za provjeru dijagonale
	private String slashDiagonal() {
		StringBuilder sb = new StringBuilder(this.height);
		for (int h = 0; h < this.height; h++) {
			int w = this.lastCol + this.lastTop - h;
			if (0 <= w && w < this.width) {
				sb.append(this.grid[h][w]);
			}
		}
		return sb.toString();
	}

	// postavljanje uslova za provjeru dijagonale
	private String backslashDiagonal() {
		StringBuilder sb = new StringBuilder(this.height);
		for (int h = 0; h < this.height; h++) {
			int w = this.lastCol - this.lastTop + h;
			if (0 <= w && w < this.width) {
				sb.append(this.grid[h][w]);
			}
		}
		return sb.toString();
	}

	private static boolean contains(String haystack, String needle) {
		return haystack.indexOf(needle) >= 0;
	}

}
