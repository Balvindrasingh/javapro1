import java.util.Scanner;

public class LaunchGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first player: ");
        String humanPlayer1Name = scanner.nextLine();

        System.out.print("Enter the second player: ");
        String humanPlayer2Name = scanner.nextLine();

        HumanPlayer humanPlayer1 = new HumanPlayer();
        humanPlayer1.setName(humanPlayer1Name);
        humanPlayer1.setMark('x');

        HumanPlayer humanPlayer2 = new HumanPlayer();
        humanPlayer2.setName(humanPlayer2Name);
        humanPlayer2.setMark('O');

        HumanPlayer currentPlayer = humanPlayer1;

        TicTacToe ticTacToe = new TicTacToe();

        boolean isDraw = false;
        while (true) {
            System.out.println(currentPlayer.getName() + "'s turn ");
            currentPlayer.makeMove();
            TicTacToe.dispBoard();

            if (TicTacToe.checkColWin() || TicTacToe.checkRowWin() || TicTacToe.checkDiagWin()) {
                System.out.println(currentPlayer.getName() + " has won ");
                System.out.println("Play again (run the code again)");
                break;
            } else if (ticTacToe.isBoardFull()) {
                System.out.println("The game is a draw.");
                System.out.println("Play again (run the code again)");
                break;
            } else {
                currentPlayer = (currentPlayer == humanPlayer1) ? humanPlayer2 : humanPlayer1;
            }




        }
    }
}