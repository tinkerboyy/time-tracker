package com.timeTracker.features.football.model;

import java.util.Set;

public class Team {

	private String teamName;
	private String teamCountry;
	private Set<Player> players;

	public Team() {
		super();
	}

	public Team(String teamName, String teamCountry) {
		super();
		this.teamName = teamName;
		this.teamCountry = teamCountry;
	}
	
	public Team(String teamName, String teamCountry, Set<Player> players) {
		super();
		this.teamName = teamName;
		this.teamCountry = teamCountry;
		this.players = players;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getTeamCountry() {
		return teamCountry;
	}

	public void setTeamCountry(String teamCountry) {
		this.teamCountry = teamCountry;
	}
	
	public Set<Player> getPlayers() {
		return players;
	}

	public void setPlayers(Set<Player> players) {
		this.players = players;
	}

}
