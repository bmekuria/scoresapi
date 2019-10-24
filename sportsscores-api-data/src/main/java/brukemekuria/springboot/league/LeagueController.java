package brukemekuria.springboot.league;

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
public class LeagueController {
	
	@Autowired
	private LeagueService leagueService;
	
	@RequestMapping("/leagues")
	public List<League> getAllLeagues() {
		return leagueService.getAllLeagues();
		
	}
	
	@RequestMapping("/leagues/{id}")
	public Optional<League> getLeague(@PathVariable String id) {
		return leagueService.getLeague(id);
	
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/leagues")
	public ResponseEntity<String> addLeague(@RequestBody League league) {
		leagueService.addLeague(league);
		return new ResponseEntity<> ("The following league has been added "+league.getName(),HttpStatus.OK);
		
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/leagues/{id}")
	public void updateLeague(@RequestBody League league, @PathVariable String id) {
		leagueService.updateLeague(league, id);
	}
	
	
	@RequestMapping(method=RequestMethod.DELETE, value="/leagues/{id}")
	public ResponseEntity<String> deleteLeague(@PathVariable String id) { 
		leagueService.deleteLeague(id);
		return new ResponseEntity<> ("The following league has been deleted "+id,HttpStatus.OK);
	}
	 

}
