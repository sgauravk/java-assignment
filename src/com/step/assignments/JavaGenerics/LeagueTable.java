package com.step.assignments.JavaGenerics;

import java.util.ArrayList;
import java.util.List;

public class LeagueTable {
    private List<Team> teamList;

    public LeagueTable() {
        this.teamList = new ArrayList<>(10);
    }

    public void addTeam(String teamName) {
        Team newTeam = new Team(teamName);
        this.teamList.add(newTeam);
    }

    public void displayAllTeams() {
        this.teamList.forEach(team -> System.out.println(team.getTeamName()));
    }
}
