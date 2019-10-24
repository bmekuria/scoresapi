package brukemekuria.springboot.league;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LeagueService {
	
	@Autowired
	private LeagueRepository leagueRepository;
		
	public List<League> getAllLeagues() {
			List<League> leagues = new ArrayList<>();
			leagueRepository.findAll().forEach(leagues::add);
			return leagues;
	}
	
	public Optional<League> getLeague(String id) {
			return leagueRepository.findById(id);
	}

	public void addLeague(League league) {
		// TODO Auto-generated method stub
		leagueRepository.save(league);
	}

	public void updateLeague(League league, String id) {
		// TODO Auto-generated method stub
		leagueRepository.save(league);
	}

	public void deleteLeague(String id) {
		// TODO Auto-generated method stub
		leagueRepository.deleteById(id);
	}
		
}
