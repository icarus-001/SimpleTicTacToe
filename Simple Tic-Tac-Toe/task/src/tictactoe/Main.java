package tictactoe;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[][] matrix = new char[3][3];
        int count = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = ' ';
                count++;
            }
        }
        String input = inputCreator(matrix);
        int order = 0;
        do{
            printMatrix(matrix);
            System.out.println("Please enter the place of symbol to be inserted");
            int row = 0;
            int column = 0;
            try {
                row = sc.nextInt();
                column = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("You should enter numbers!");
            }
            if (row > 3 || row < 1 || column > 3 || column < 1) {
                System.out.println("Coordinates should be from 1 to 3!");
                continue;
            } else if (matrix[row - 1][column - 1] != ' ') {
                System.out.println("This cell is occupied! Choose another one!");
                continue;
            } else {
                if(order % 2 == 0) {
                    matrix[row - 1][column - 1] = 'X';
                    order++;
                } else {
                    matrix[row - 1][column - 1] = 'O';
                    order++;
                }
                input = inputCreator(matrix);
            }

        } while(checkWinner(input, matrix).equals("Game not finished"));

        }
    public static String inputCreator(char[][] matrix) {
        String result = "";
        for (int i = 0; i < 3; i++ ) {
            for (int j = 0; j < 3; j++) {
                result += matrix[i][j];
            }
        }
        return result;
    }



    public static String checkWinner(String input, char[][] matrix) {
        if (Math.abs(countXOs(input, 'X') - countXOs(input, 'O')) > 1) {
            return "Impossible";
        }
        if (checkCharWinner(input, 'X') && checkCharWinner(input, 'O')) {
            return "Impossible";
        }

        if(checkCharWinner(input, 'X')) {
            printMatrix(matrix);
            System.out.println("X wins");
            return "X wins";
        }

        if(checkCharWinner(input, 'O')) {
            printMatrix(matrix);
            System.out.println("O wins");
            return "O wins";
        }

        if (input.contains(" ")) {
            return "Game not finished";
        }

        printMatrix(matrix);
        System.out.println("Draw");

        return "Draw";


    }

    public static boolean checkCharWinner(String input, char character) {
        if (input.charAt(0) == character && input.charAt(1) == character && input.charAt(2) == character) {
            return true;
        }

        if (input.charAt(3) == character && input.charAt(4) == character && input.charAt(5) == character) {
            return true;
        }

        if (input.charAt(6) == character && input.charAt(7) == character && input.charAt(8) == character) {
            return true;
        }

        if (input.charAt(0) == character && input.charAt(3) == character && input.charAt(6) == character) {
            return true;
        }

        if (input.charAt(1) == character && input.charAt(4) == character && input.charAt(7) == character) {
            return true;
        }

        if (input.charAt(2) == character && input.charAt(5) == character && input.charAt(8) == character) {
            return true;
        }

        if (input.charAt(0) == character && input.charAt(4) == character && input.charAt(8) == character) {
            return true;
        }

        if (input.charAt(2) == character && input.charAt(4) == character && input.charAt(6) == character) {
            return true;
        }
        return false;
    }
    public static int countXOs(String input, char character) {
        int characterCount = 0;
        for(int i = 0; i < input.length(); i++) {
            if(input.charAt(i) == character) {
                characterCount++;
            }
        }
        return characterCount;
    }

    public static void printMatrix(char[][] matrix) {
        System.out.println("-----------");
        for(int i = 0; i < 3; i++){
            System.out.println("| " + matrix[i][0] + " " + matrix[i][1] + " " + matrix[i][2] + " |");
        }
        System.out.println("-----------");
    }

}
