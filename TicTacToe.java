/*// A simple program to demonstrate
// Tic-Tac-Toe Game.
import java.util.*;
 
public class GFG {
   
    static String[] board;
    static String turn;
   
   
    // CheckWinner method will
    // decide the combination
    // of three box given below.
    static String checkWinner()
    {
        for (int a = 0; a < 8; a++) {
            String line = null;
 
            switch (a) {
            case 0:
                line = board[0] + board[1] + board[2];
                break;
            case 1:
                line = board[3] + board[4] + board[5];
                break;
            case 2:
                line = board[6] + board[7] + board[8];
                break;
            case 3:
                line = board[0] + board[3] + board[6];
                break;
            case 4:
                line = board[1] + board[4] + board[7];
                break;
            case 5:
                line = board[2] + board[5] + board[8];
                break;
            case 6:
                line = board[0] + board[4] + board[8];
                break;
            case 7:
                line = board[2] + board[4] + board[6];
                break;
            }
            //For X winner
            if (line.equals("XXX")) {
                return "X";
            }
             
            // For O winner
            else if (line.equals("OOO")) {
                return "O";
            }
        }
         
        for (int a = 0; a < 9; a++) {
            if (Arrays.asList(board).contains(
                    String.valueOf(a + 1))) {
                break;
            }
            else if (a == 8) {
                return "draw";
            }
        }
 
       // To enter the X Or O at the exact place on board.
        System.out.println(
            turn + "'s turn; enter a slot number to place "
            + turn + " in:");
        return null;
    }
     
    // To print out the board.
    /* |---|---|---|
       | 1 | 2 | 3 |
       |-----------|
       | 4 | 5 | 6 |
       |-----------|
       | 7 | 8 | 9 |
       |---|---|---|
   
    static void printBoard()
    {
        System.out.println("|---|---|---|");
        System.out.println("| " + board[0] + " | "
                           + board[1] + " | " + board[2]
                           + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[3] + " | "
                           + board[4] + " | " + board[5]
                           + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[6] + " | "
                           + board[7] + " | " + board[8]
                           + " |");
        System.out.println("|---|---|---|");
    }
 
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        board = new String[9];
        turn = "X";
        String winner = null;
 
        for (int a = 0; a < 9; a++) {
            board[a] = String.valueOf(a + 1);
        }
 
        System.out.println("Welcome to 3x3 Tic Tac Toe.");
        printBoard();
 
        System.out.println(
            "X will play first. Enter a slot number to place X in:");
 
        while (winner == null) {
            int numInput;
           
           // Exception handling.
           // numInput will take input from user like from 1 to 9.
           // If it is not in range from 1 to 9.
           // then it will show you an error "Invalid input."
            try {
                numInput = in.nextInt();
                if (!(numInput > 0 && numInput <= 9)) {
                    System.out.println(
                        "Invalid input; re-enter slot number:");
                    continue;
                }
            }
            catch (InputMismatchException e) {
                System.out.println(
                    "Invalid input; re-enter slot number:");
                continue;
            }
             
            // This game has two player x and O.
            // Here is the logic to decide the turn.
            if (board[numInput - 1].equals(
                    String.valueOf(numInput))) {
                board[numInput - 1] = turn;
 
                if (turn.equals("X")) {
                    turn = "O";
                }
                else {
                    turn = "X";
                }
 
                printBoard();
                winner = checkWinner();
            }
            else {
                System.out.println(
                    "Slot already taken; re-enter slot number:");
            }
        }
       
        // If no one win or lose from both player x and O.
        // then here is the logic to print "draw".
        if (winner.equalsIgnoreCase("draw")) {
            System.out.println(
                "It's a draw! Thanks for playing.");
        }
       
        // For winner -to display Congratulations! message.
        else {
            System.out.println(
                "Congratulations! " + winner
                + "'s have won! Thanks for playing.");
        }
      in.close();
    }
} 
*/



import java.util.Random;
import java.util.Scanner;
import java.util.random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TicTacToe {

    static ArrayList<Integer> playerPositions = new ArrayList<Integer>();
        static ArrayList<Integer> cpuPositions = new ArrayList<Integer>();

    public static void main(String []args){

        char [][] gameBoard = {{' ', '|', ' ', '|', ' '}, {'-', '+', '-', '+', '-'}, {' ', '|', ' ', '|', ' '}, {'-', '+', '-', '+', '-'}, {' ', '|', ' ', '|', ' '}};

        printGameBoard(gameBoard);
       
       while(true){
        Scanner scan = new Scanner(System.in);

          System.out.println("Enter your placement (1-9:)");
        int playerPos = scan.nextInt();
        while(playerPositions.contains(playerPos) || cpuPositions.contains(playerPositions)){
            System.out.println("Position taken! Enter a correct Position");
            playerPos = scan.nextInt();
        }

        String result = checkWinner();
        placePiece(gameBoard, playerPos, "player");

         if (results.length() > 0){
            System.out.println(result);
            break;
        }

        Random rand = new Random();
        int cpuPos = rand.nextInt(9) + 1;
        while(playerPositions.contains(cpuPos) || cpuPositions.contains(cpuPos)){
            System.out.println("Cpu messed up");
            cpuPos = rand.nextInt(9) + 1;
        }

        placePiece(gameBoard, cpuPos, "cpu");
        printGameBoard(gameBoard);
        result = checkWinner();

        if (results.length() > 0){
            System.out.println(result);
            break;
        }

       }
        
    }

    public static void printGameBoard(char [][] gameBoard){
        for (char [] row : gameBoard){
            for (char c : row){
                System.out.print(c);
            }
            System.out.println();
        }
    }
    
    public static void placePiece(char [][] gameBoard, int pos, String user){

        char symbol = ' ';

        if (user.equals("player")){
            symbol ='X';
            playerPositions.add(pos);
        } else if (user.equals("cpu")){
            symbol = 'O';
            cpuPositions.add(pos);
        }
        
        switch(pos){
            case 1:
            gameBoard[0][0] = symbol;
            break;
            case 2:
            gameBoard[0][2] = symbol;
            break;
            case 3:
            gameBoard[0][4] = symbol;
            break;
            case 4:
            gameBoard[2][0] = symbol;
            break;
            case 5:
            gameBoard[2][2] = symbol;
            break;
            case 6:
            gameBoard[2][4] = symbol;
            break;
            case 7:
            gameBoard[4][0] = symbol;
            break;
            case 8:
            gameBoard[4][2] = symbol;
            break;
            case 9:
            gameBoard[4][4] = symbol;
            break;

            default:
                break;
        }

    }
    public static String checkWinner(){

        List topRow = Arrays.asList(1, 2, 3);
        List midRow = Arrays.asList(4, 5, 6);
        List botRow = Arrays.asList(7, 8, 9);
        List leftCol = Arrays.asList(1, 4, 7);
        List midCol = Arrays.asList(2, 5, 8);
        List RightCol = Arrays.asList(3, 6, 9);
        List cross1 = Arrays.asList(1, 5, 9);
        List cross2 = Arrays.asList(3, 5, 7);

        List<List> winning = new ArrayList<List>();
        winning.add(topRow);
        winning.add(midRow);
        winning.add(botRow);
        winning.add(leftCol);
        winning.add(midCol);
        winning.add(RightCol);
        winning.add(cross1);
        winning.add(cross2);

        for(List l : winning){
            if(playerPositions.containsAll(l)){
                return "Congratulations you won!";
            } else if(cpuPositions.containsAll(l)){
                return "CPU wins! Sorry :(";
            } else if(playerPositions.size() + cpuPositions.size() ==9){
                return "Tie";
            }
        }

        return "";
    }
}