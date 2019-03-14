package com.step.assignments.JavaGenerics;

public class Main {
    public static void main(String[] args) {
        LeagueTable league = new LeagueTable();
        league.addTeam("chennai super kings");
        league.addTeam("mumbai indians");
        league.addTeam("royal challenger bangalore");
        league.addTeam("kings x1 punjab");
        league.displayAllTeams();
    }
}
