package uz.pdp.pc_market_uz_with_security_first.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.pc_market_uz_with_security_first.entity.Team;
import uz.pdp.pc_market_uz_with_security_first.projection.CustomTeam;

@RepositoryRestResource(path = "team", excerptProjection = CustomTeam.class)
public interface TeamRepository extends JpaRepository<Team, Integer> {
}
