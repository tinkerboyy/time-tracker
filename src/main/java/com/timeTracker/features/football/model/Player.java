package com.timeTracker.features.football.model;

public class Player {
	
	private int playerNo;
	private String playerName;
	private String playerPosition;
	
	public Player() {
		super();
	}
	
	public Player(int playerNo, String playerName, String playerPosition) {
		super();
		this.playerNo = playerNo;
		this.playerName = playerName;
		this.playerPosition = playerPosition;
	}

	public int getPlayerNo() {
		return playerNo;
	}

	public void setPlayerNo(int playerNo) {
		this.playerNo = playerNo;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public String getPlayerPosition() {
		return playerPosition;
	}

	public void setPlayerPosition(String playerPosition) {
		this.playerPosition = playerPosition;
	}
	
}
