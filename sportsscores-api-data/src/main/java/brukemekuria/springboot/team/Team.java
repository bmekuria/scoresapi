package brukemekuria.springboot.team;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import brukemekuria.springboot.league.League;

@Entity
public class Team {
	
	@Id
	private String id;
	private String name;
	private int points;
	private int wins;
	private int losses;
	private int draws;
	private int position;
	
	@ManyToOne
	private League league;
	
	public Team() {
		
	}
	
	public Team(String id, String name, int points, int wins, int losses, int draws, int pos, String leagueId) {
		super();
		this.id = id;
		this.name = name;
		this.points = points;
		this.wins = wins;
		this.losses = losses;
		this.draws = draws;
		this.position = pos;
		this.setLeague(new League(leagueId,"",""));
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public int getWins() {
		return wins;
	}

	public void setWins(int wins) {
		this.wins = wins;
	}

	public int getLosses() {
		return losses;
	}

	public void setLosses(int losses) {
		this.losses = losses;
	}

	public int getDraws() {
		return draws;
	}

	public void setDraws(int draws) {
		this.draws = draws;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public League getLeague() {
		return league;
	}

	public void setLeague(League league) {
		this.league = league;
	}
	

}
