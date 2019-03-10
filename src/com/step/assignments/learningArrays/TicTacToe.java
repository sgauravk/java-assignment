package com.step.assignments.learningArrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] places = {" ", " ", " ", " ", " ", " ", " ", " ", " "};
        String[] numbers = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
        List<String> allocateBlocks = new ArrayList(9);
        List<String> playersName = new ArrayList(2);
        getPlayerName(scanner, playersName);
        getPlayerName(scanner, playersName);
        playGame(playersName, places, allocateBlocks, numbers);
    }

    public static void playGame(List<String> playersName, String[] places, List<String> allocateBlocks, String[] numbers) {
        Scanner scanner = new Scanner(System.in);
        printBox(numbers);
        for (int i = 0; i < 9; i++) {
            String playerSymbol = "O";
            if (isEven(i)) playerSymbol = "X";
            String currentPlayer = changeTurn(playersName, i);
            System.out.println("\n" + currentPlayer + "'s turn");
            places = getPlayerInput(scanner, places, allocateBlocks, playerSymbol);
            printBox(numbers);
            System.out.println("\n*──────────*");
            printBox(places);
        }
        System.out.println("\nOOPS MATCH DRAW\n");
    }

    public static void printBox(String[] list) {
        int count = 0;
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.println(" " + list[count] + " │ " + list[count + 1] + " │ " + list[count + 2]);
            if (i == 2) break;
            System.out.println("───┼───┼───");
            count += 3;
        }
    }

    public static String[] getPlayerInput(Scanner scanner, String[] list, List<String> allocatePlaces, String playerSymbol) {
        System.out.println("\nEnter a number: ");
        int input = scanner.nextInt();
        int allocatePlaceSize = allocatePlaces.size();
        while (allocatePlaces.size() == allocatePlaceSize) {
            if (!allocatePlaces.contains(String.valueOf(input)) && input < 10 && input > 0) {
                allocatePlaces.add(String.valueOf(input));
                list[input - 1] = playerSymbol;
                break;
            }
            input = displayErrMsg(scanner);
        }
        return list;
    }

    public static int displayErrMsg(Scanner scanner) {
        System.out.println("\nbox is already allocate or invalid input");
        System.out.println("\n────────────────────────────────────────");
        System.out.println("\nEnter a number: ");
        int input = scanner.nextInt();
        return input;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static String changeTurn(List<String> players, int count) {
        if (isEven(count)) {
            return players.get(0);
        }
        return players.get(1);
    }

    public static List<String> getPlayerName(Scanner scanner, List<String> playersList) {
        String currentPlayer = "player2";
        String playerSymbol = "O";
        if (playersList.size() < 1) {
            currentPlayer = "player1";
            playerSymbol = "X";
        }
        System.out.println("\nEnter " + currentPlayer + " name");
        String player = scanner.nextLine();
        if (player.length() == 0) player = currentPlayer;
        System.out.println("\nHello " + player + " your symbol is " + playerSymbol);
        playersList.add(player);
        return playersList;
    }
}
