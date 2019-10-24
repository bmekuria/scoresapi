package brukemekuria.springboot.team;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeamService {
	
	@Autowired
	private TeamRepository teamRepository;
		
	public List<Team> getAllTeams(String leagueId) {
			List<Team> teams = new ArrayList<>();
			teamRepository.findByLeagueId(leagueId)
			.forEach(teams::add);
			return teams;
	}
	
	public Optional<Team> getTeam(String id) {
			return teamRepository.findById(id);
	}

	public void addTeam(Team team) {
		// TODO Auto-generated method stub
		teamRepository.save(team);
	}

	public void updateTeam(Team team) {
		// TODO Auto-generated method stub
		teamRepository.save(team);
	}

	public void deleteTeam(String id) {
		// TODO Auto-generated method stub
		teamRepository.deleteById(id);
	}
		
}
