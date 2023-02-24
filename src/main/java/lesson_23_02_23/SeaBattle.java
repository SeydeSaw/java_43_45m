package lesson_23_02_23;

import java.util.Scanner;

public class SeaBattle {

    static Scanner scanner = new Scanner(System.in);
    static String playerOne, playerTwo;
    static int[] shipForm = {4,1};
    static char[][] fieldPlayerOne;
    static char[][] fieldPlayerTwo;

    public static void main(String[] args) {
        // # - ship
        // * - shooted ship
        intro();
        initGenerateField();

        settingUpFieldPlayerOne();
        settingUpFieldPlayerTwo();

    }

    public static void settingUpFieldPlayerOne() {
        int amountOfShips = shipForm[0];

        while (amountOfShips >= 1) {

            System.out.println("Setting up for " + playerOne.toUpperCase());
            System.out.print("Enter X coordinate for setting ship: ");
            int x = scanner.nextInt();
            System.out.print("Enter Y coordinate for setting ship: ");
            int y = scanner.nextInt();

            if (x <= 9 && x >= 0) {
                if (y <= 9 && y >= 0) {
                    if (fieldPlayerOne[y + 1][x + 1] != '#') {
                        fieldPlayerOne[y + 1][x + 1] = '#';
                        amountOfShips--;
                    } else System.out.println("mistake in X/Y coordinates");
                } else System.out.println("Problem with Y-coordinate");
            } else System.out.println("Problem with X-coordinate");

            printField("one");
        }
    }

    public static void settingUpFieldPlayerTwo() {
        int amountOfShips = shipForm[0];

        while (amountOfShips >= 1) {

            System.out.println("Setting up for " + playerTwo.toUpperCase());
            System.out.print("Enter X coordinate for setting ship: ");
            int x = scanner.nextInt();
            System.out.print("Enter Y coordinate for setting ship: ");
            int y = scanner.nextInt();

            if (x <= 9 && x >= 0) {
                if (y <= 9 && y >= 0) {
                    if (fieldPlayerTwo[y + 1][x + 1] != '#') {
                        fieldPlayerTwo[y + 1][x + 1] = '#';
                        amountOfShips--;
                    } else System.out.println("mistake in X/Y coordinates");
                } else System.out.println("Problem with Y-coordinate");
            } else System.out.println("Problem with X-coordinate");

            printField("two");
        }
    }

    public static void printField(String player) {
        if (player.equals("one")) {
            System.out.println("Field for player: " + playerOne.toUpperCase());
            for (int i = 0; i < fieldPlayerOne.length; i++) {
                for (int j = 0; j < fieldPlayerOne[i].length; j++)
                    System.out.print(fieldPlayerOne[i][j] + " ");
                System.out.println();
            }
            System.out.println();

        } else if (player.equals("two")) {
            System.out.println("Field for player: " + playerTwo.toUpperCase());
            for (int i = 0; i < fieldPlayerTwo.length; i++) {
                for (int j = 0; j < fieldPlayerTwo[i].length; j++)
                    System.out.print(fieldPlayerTwo[i][j] + " ");
                System.out.println();
            }
            System.out.println();
        } else {
            System.out.println("error in printField method with arguments");
        }
    }

    public static void initGenerateField() {
        // поле 10х10 + 1 строчка - заголовок
        fieldPlayerOne = new char[11][11];
        fieldPlayerTwo = new char[11][11];

        // поле 11х11, заголовок для 1 строки
        char[] header = {' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

        System.out.println("Field for player: " + playerOne.toUpperCase());
        fieldPlayerOne[0] = header;
        for (int i = 0; i < fieldPlayerOne.length; i++) {
            for (int j = 0; j < fieldPlayerOne[i].length; j++) {
                // приводим соответствие позиции строки с элементом из нашего header массива
                fieldPlayerOne[i][0] = header[i];
                System.out.print(fieldPlayerOne[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Field for player: " + playerTwo.toUpperCase());
        fieldPlayerTwo[0] = header;
        for (int i = 0; i < fieldPlayerTwo.length; i++) {
            for (int j = 0; j < fieldPlayerTwo[i].length; j++) {
                // приводим соответствие позиции строки с элементом из нашего header массива
                fieldPlayerTwo[i][0] = header[i];
                System.out.print(fieldPlayerTwo[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void intro() {
        System.out.println("Hello users, it's a sea battle!");
        System.out.print("Pls player1 enter your name: ");
        playerOne = scanner.nextLine();

        System.out.print("Pls player2 enter your name: ");
        playerTwo = scanner.nextLine();
        System.out.println();
    }
}
