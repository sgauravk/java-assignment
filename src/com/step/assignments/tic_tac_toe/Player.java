package com.step.assignments.tic_tac_toe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Player {
    private String playerCount;
    private String playerName;
    private List<Integer> playerMoves;
    private Scanner scanner;
    private String playerSymbol;

    public Player(String playerCount, String playerSymbol) {
        this.playerMoves = new ArrayList<>(5);
        this.scanner = new Scanner(System.in);
        this.playerCount = playerCount;
        this.playerSymbol = playerSymbol;
        this.playerName = getName();
    }

    public List<Integer> getPlayerMoves() {
        return playerMoves;
    }

    public String getName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter " + this.playerCount + " name");
        String player = scanner.nextLine();
        if (player.length() < 1) player = this.playerCount;
        System.out.println("\nHello " + player + " your symbol is " + this.playerSymbol);
        return player;
    }

    public void displayErrMsg() {
        System.out.println("\nbox is already allocate or invalid input");
        System.out.println("\n────────────────────────────────────────");
        System.out.println("\nHey " + this.playerName + " enter your move: ");
    }

    public void playMove(List<Integer> possibleMoves, HashMap<Integer, String> allMoves) {
        System.out.println("\nHey " + this.playerName + " enter your move: ");
        int move = scanner.nextInt();
        while (!possibleMoves.contains(move)) {
            displayErrMsg();
            move = scanner.nextInt();
        }
        possibleMoves.remove(Integer.valueOf(move));
        this.playerMoves.add(move);
        allMoves.put(move, this.playerSymbol);
    }

    public String getPlayerName() {
        return this.playerName;
    }

    public String getPlayerSymbol() {
        return playerSymbol;
    }
}
