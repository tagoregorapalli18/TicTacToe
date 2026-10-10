package com.tictactoe;


import java.util.Scanner;

public class TicTacToe {
    private static final char[] board = {
        '1','2','3','4','5','6','7','8','9'
    };

    private static char currentPlayer = 'X';
    private static int moves = 0;
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("=== Tic-Tac-Toe ===");
        System.out.println("Player 1: X | Player 2: O");

        while (true) {
            displayBoard();
            System.out.print("Player " + currentPlayer
                    + ", choose a position (1-9): ");

            if (!scanner.hasNextInt()) {
                System.out.println("Please enter a number from 1 to 9.");
                scanner.next();
                continue;
            }

            int position = scanner.nextInt();

            if (position < 1 || position > 9) {
                System.out.println("Invalid position. Try again.");
                continue;
            }

            if (board[position - 1] == 'X'
                    || board[position - 1] == 'O') {
                System.out.println("Position already taken. Try again.");
                continue;
            }

            board[position - 1] = currentPlayer;
            moves++;

            if (hasWon(currentPlayer)) {
                displayBoard();
                System.out.println("Player " + currentPlayer + " wins!");
                break;
            }

            if (moves == 9) {
                displayBoard();
                System.out.println("It's a draw!");
                break;
            }

            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }

        scanner.close();
    }

    private static void displayBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    private static boolean hasWon(char player) {
        int[][] lines = {
            {0,1,2}, {3,4,5}, {6,7,8},
            {0,3,6}, {1,4,7}, {2,5,8},
            {0,4,8}, {2,4,6}
        };

        for (int[] line : lines) {
            if (board[line[0]] == player
                    && board[line[1]] == player
                    && board[line[2]] == player) {
                return true;
            }
        }

        return false;
    }
}
