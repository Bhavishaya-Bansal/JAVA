package com.bhav.JavaProjects;

import java.util.*;

public class TicTacToe {
    public static void main(String[] args) {
        char board[][]= new char[3][3]; // 3 by 3 board 
        for(int row= 0; row< board.length; row++){
            for(int colm= 0; colm< board[row].length; colm++){
                board[row][colm]= ' '; // initially the board is made empty.. 
            }
        }
        char player= 'X'; // suppose initially we start with X
        boolean gameOver= false; // as the game is not over so we have made it initially false;

        Scanner sc= new Scanner(System.in);
        while(!gameOver){
            // First just print the board
            printBoard(board);
            
            // second we will ask for input
            System.out.println("Player "+ player + " enter: ");

            int row= sc.nextInt();
            int colm= sc.nextInt();

            // if the particular index is empty then only take input
            if(board[row][colm]== ' '){
                // place the element
                board[row][colm]= player;
                gameOver= haveWon(board, player);
                
                // if the game gets over, announce the winner
                if(gameOver){
                    System.out.println("Player "+ player + " has won..");
                }

                // else switch the player
                else{
                    if(player== 'X'){
                        player= 'O';
                    }
                    else{
                        player= 'X';
                    }
                }
            }
            else{
                System.out.println("invalid move");
            }
        }
        printBoard(board);
    }

    
    public static void printBoard(char[][] board) {
        for(int row= 0; row< board.length; row++){
            for(int colm= 0; colm< board[row].length; colm++){
                System.out.print(board[row][colm]+ " | ");
            }
            System.out.println();
        }
    }

    public static boolean haveWon(char[][] board, char player) {
        // check the rows
        for(int row= 0; row< board.length; row++){
            if(board[row][0]== player && board[row][1]== player && board[row][2]== player){
                return true;
            }
        }

        // check the colm
        for(int colm= 0; colm< board.length; colm++){
            if(board[0][colm]== player && board[1][colm]== player && board[2][colm]== player){
                return true;
            }
        }

        // check for the diagonals..
        // Diagonal 1
        if(board[0][0]== player && board[1][1]== player && board[2][2]== player){
            return true;
        }

        // Diagonal 2
        if(board[0][2]== player && board[1][1]== player && board[2][0]== player){
            return true;
        }

        return false;
    }
}
