package com.step.assignments.tic_tac_toe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Bot extends Player {
    private List<Integer> botMoves;

    public Bot(String playerSymbol) {
        super("Computer", playerSymbol);
        this.botMoves = new ArrayList<>(5);
    }

    @Override
    public List<Integer> getPlayerMoves() {
        return this.botMoves;
    }

    @Override
    public String getName() {
        String symbol = super.getPlayerSymbol();
        System.out.println("\nComputer's symbol is " + symbol);
        return "Computer";
    }

    @Override
    public void playMove(List<Integer> possibleMoves, HashMap<Integer, String> allMoves) {
        int randomIndex = (int) (Math.random() * possibleMoves.size());
        int move = possibleMoves.get(randomIndex);
        System.out.println("\nComputer's move is " + move);
        possibleMoves.remove(Integer.valueOf(move));
        this.botMoves.add(move);
        allMoves.put(move, super.getPlayerSymbol());
    }

    @Override
    public String getPlayerName() {
        return "Computer";
    }
}
