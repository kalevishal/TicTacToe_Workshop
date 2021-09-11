import java.util.Scanner;

public class Tic_Tac_ToeGame {
    static char[] board = new char[10];
    public static void main(String args[]) {
        System.out.println("Welcome to Tic-Tac-Toe game");
        board();
        PlayerOption();
        showBoard();
    }
    private static void board() {
        for (int i = 1; i < board.length; i++) {
            board[i] = ' ';
        }
    }
    public static void PlayerOption() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Player should select X or O: ");
        char playerschoice = sc.next().charAt(0);
        char computerchoice;
        if(playerschoice == 'O'|| playerschoice =='X')
        {
            System.out.println("Valid Selection");
            if (playerschoice=='O')
            {
                computerchoice = 'X';
            }
            else
                computerchoice='O';
        }
        else
        {
            System.out.println("Invalid Selection");
        }
    }
    public static void showBoard() {
        System.out.println(" ----------- ");
        System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
        System.out.println("| " + board[1] + " | " + board[2] + " | " + board[3] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
        System.out.println("| " + board[4] + " | " + board[5] + " | " + board[6] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
        System.out.println("| " + board[7] + " | " + board[8] + " | " + board[9] + " |");
        System.out.println(" ----------- ");
    }
}
