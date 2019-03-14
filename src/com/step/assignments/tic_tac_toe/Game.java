package com.step.assignments.tic_tac_toe;

import java.util.*;

public class Game {
    public static void main(String[] args) {
        HashMap<Integer, String> moves = new HashMap<>(9);
        List<Integer> initialPossibleMoves = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        initialPossibleMoves.forEach(move -> moves.put(move, " "));
        Player player1 = getUsersChoice();
        Player player2 = new Player("player2", "O");
        playGame(player1, player2, initialPossibleMoves, moves);
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static Player getUsersChoice() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> choices = Arrays.asList(1, 2);
        System.out.println("\nHello select your playing mode\n\n 1. single player\n\n 2. multiplayer\n");
        int choice = scanner.nextInt();
        while (!choices.contains(choice)) {
            System.out.println("\nINVALID INPUT PLEASE SELECT A VALID OPTION\n");
            choice = scanner.nextInt();
        }
        if(choice == 1) return new Bot("X");
        return new Player("player1", "X");
    }

    public static List<List<Integer>> getWinningsMoves() {
        List<List<Integer>> winningPattern = new ArrayList<>(8);
        winningPattern.add(Arrays.asList(1, 2, 3));
        winningPattern.add(Arrays.asList(4, 5, 6));
        winningPattern.add(Arrays.asList(7, 8, 9));
        winningPattern.add(Arrays.asList(1, 4, 7));
        winningPattern.add(Arrays.asList(2, 5, 8));
        winningPattern.add(Arrays.asList(3, 6, 9));
        winningPattern.add(Arrays.asList(1, 5, 9));
        winningPattern.add(Arrays.asList(3, 5, 7));
        return winningPattern;
    }

    public static boolean isSubset(List mainList, List subList) {
        return subList.stream().allMatch(element -> mainList.contains(element));
    }

    public static boolean isWin(List playerMoves) {
        List<List<Integer>> winningPattern = getWinningsMoves();
        return winningPattern.stream().anyMatch(pattern -> isSubset(playerMoves, pattern));
    }

    public static void printBox(HashMap<Integer, String> list) {
        int count = 1;
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.println(" " + list.get(count) + " │ " + list.get(count + 1) + " │ " + list.get(count + 2));
            if (i == 2) continue;
            System.out.println("───┼───┼───");
            count += 3;
        }
    }

    public static void playGame(Player player1, Player player2, List<Integer> initialPossibleMoves, HashMap<Integer, String> moves) {
        HashMap<Integer, String> initialMoves = new HashMap<>(9);
        initialPossibleMoves.forEach(number -> initialMoves.put(number, number.toString()));
        printBox(initialMoves);
        for (int i = 0; i < 9; i++) {
            Player currentPlayer = player2;
            if (isEven(i)) currentPlayer = player1;
            currentPlayer.playMove(initialPossibleMoves, moves);
            printBox(initialMoves);
            printBox(moves);
            if (isWin(currentPlayer.getPlayerMoves())) {
                System.out.println("\nCONGRATULATIONS !!! " + currentPlayer.getPlayerName() + " won\n");
                System.exit(0);
            }
        }
        System.out.println("\nOOPS MATCH DRAW\n");
    }
}
