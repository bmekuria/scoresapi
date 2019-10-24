package brukemekuria.springboot.league;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class League {
	
	@Id
	private String id;
	private String name;
	private String description;
	private int totalteams;
	
	public League() {
		
	}
	
	public League(String id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public int getTotalteams() {
		return totalteams;
	}

	public void setTotalteams(int totalteams) {
		this.totalteams = totalteams;
	}
	
	

}
