package brukemekuria.springboot.team;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface TeamRepository extends CrudRepository<Team, String> {
	
	public List<Team> findByLeagueId(String leagueId);

}
