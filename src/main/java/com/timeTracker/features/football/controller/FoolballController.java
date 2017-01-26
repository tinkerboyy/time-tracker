package com.timeTracker.features.football.controller;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.timeTracker.features.football.model.Player;
import com.timeTracker.features.football.model.Team;

@Controller
public class FoolballController {
	
	private Team team;
	
	@PostConstruct
	public void init() {
		Set<Player> players = new HashSet<>();
		players.add(new Player(10, "Madhukar", "Playmaker"));
		players.add(new Player(7, "Ronaldo", "Attacking Midfielder"));
		players.add(new Player(11, "Messi", "Forward"));
		
		team = new Team("Arsenal", "England", players);
	}
	
	@RequestMapping("/")
	public @ResponseBody Team getTeamInfo() {
		return team;
	}
}
