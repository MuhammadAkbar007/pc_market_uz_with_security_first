package uz.pdp.pc_market_uz_with_security_first.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.security.access.prepost.PreAuthorize;
import uz.pdp.pc_market_uz_with_security_first.entity.Team;
import uz.pdp.pc_market_uz_with_security_first.projection.CustomTeam;

import java.util.List;
import java.util.Optional;

@RepositoryRestResource(path = "team", excerptProjection = CustomTeam.class)
public interface TeamRepository extends JpaRepository<Team, Integer> {

//    @PreAuthorize("hasRole('admin')")
//    @Override
//    List<Team> findAll();
//
//    @PreAuthorize("hasRole('admin')")
//    @Override
//    Optional<Team> findById(Integer integer);
//
//    @PreAuthorize("hasRole('admin')")
//    @Override
//    <S extends Team> S save(S s);
//
//    @PreAuthorize("hasRole('admin')")
//    @Override
//    <S extends Team> S saveAndFlush(S s);
//
//    @PreAuthorize("hasRole('admin')")
//    @Override
//    void deleteById(Integer integer);
}
