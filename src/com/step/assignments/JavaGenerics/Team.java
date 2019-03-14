package com.step.assignments.JavaGenerics;

public class Team {
    private String teamName;
    private int playedMatches;
    private int wonMatches;
    private int lossMatches;
    private int drawMatches;
    private int totalPoints;

    public Team(String teamName) {
        this.teamName = teamName;
        this.playedMatches = 0;
        this.wonMatches = 0;
        this.lossMatches = 0;
        this.drawMatches = 0;
        this.totalPoints = 0;
    }

    public void won() {
        this.playedMatches++;
        this.wonMatches++;
        this.totalPoints += 2;
    }

    public void loss() {
        this.playedMatches++;
        this.lossMatches++;
    }

    public void draw() {
        this.playedMatches++;
        this.drawMatches++;
        this.totalPoints++;
    }

    public String getTeamName() {
        return teamName;
    }

    public int getTotalPoints() {
        return this.totalPoints;
    }
}
