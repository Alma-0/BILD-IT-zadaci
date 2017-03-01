package week3_project;


import java.util.Scanner;


public class ConnectFourGame {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
            int height = 6, width = 7, moves = height * width;
            Game board = new Game(width, height);
            System.out.println("Use 0-" + (width - 1) + " to choose a column.");
            System.out.println(board);
            
            
            char[] players = new char[] { 'R', 'Y' };
            //Ispis ploce, ispis poruke u slucaju pobijede
            for (int player = 0; moves-- > 0; player = 1 - player) {
                char symbol = players[player];
                board.chooseAndDrop(symbol, input);
                System.out.println(board);
                if (board.isWinningPlay()) {
                    System.out.println("Player " + symbol + " wins!");
                    return;
                }
            }
            System.out.println("Game over, no winner.");
        }
    }
}
