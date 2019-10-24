package brukemekuria.springboot.league;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface LeagueRepository extends CrudRepository<League, String> {
	
	public List<League> findByName(String name);

}
