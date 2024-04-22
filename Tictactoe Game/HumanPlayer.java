import java.util.Scanner;

class HumanPlayer {
    private String name;
    private char mark;

    public HumanPlayer() {
    }

    public HumanPlayer(String name, char mark) {
        this.name = name;
        this.mark = mark;
    }

    void makeMove() {
        Scanner scan = new Scanner(System.in);
        int row;
        int col;
        do {
            System.out.println("Enter the Row and Column of your move");
            row = scan.nextInt();
            col = scan.nextInt();
        } while (!isValidMove(row, col));
        TicTacToe.placemark(row, col, mark);
    }

    boolean isValidMove(int row, int col) {
        if (row >= 0 && row <= 2 && col >= 0 && col <= 2) {
            if (TicTacToe.board[row][col] == ' ') {
                return true;
            }
        }
        return false;
    }

    // Getter and setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and setter for mark
    public char getMark() {
        return mark;
    }

    public void setMark(char mark) {
        this.mark = mark;
    }
}