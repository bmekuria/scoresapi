package brukemekuria.springboot.team;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import brukemekuria.springboot.league.League;

@RestController
public class TeamController {
	
	@Autowired
	private TeamService teamService;
	
	@RequestMapping("/leagues/{id}/teams")
	public List<Team> getAllTeams(@PathVariable String id) {
		return teamService.getAllTeams(id);
		
	}
	
	@RequestMapping("/leagues/{id}/teams/{id}")
	public Optional<Team> getTeam(@PathVariable String id) {
		return teamService.getTeam(id);
		
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/leagues/{leagueId}/teams")
	public ResponseEntity<String> addTeam(@RequestBody Team team, @PathVariable String leagueId) {
		team.setLeague(new League(leagueId,"",""));
		teamService.addTeam(team);
		return new ResponseEntity<>("The following team has been added"+team.getName(),HttpStatus.OK);
		
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/leagues/{leagueId}/teams/{id}")
	public void updateTeam(@RequestBody Team team, @PathVariable String leagueId, @PathVariable String id) {
		team.setLeague(new League(leagueId,"",""));
		teamService.updateTeam(team);
	}
	
	
	@RequestMapping(method=RequestMethod.DELETE, value="/leagues/{leagueId}/teams/{id}") 
	public ResponseEntity<String> deleteTeam(@PathVariable String id) { 
		teamService.deleteTeam(id);
		return new ResponseEntity<>("The following team has been deleted"+id,HttpStatus.OK);
	}
	 

}
