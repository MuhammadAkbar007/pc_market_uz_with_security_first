package uz.pdp.pc_market_uz_with_security_first.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.security.access.prepost.PreAuthorize;
import uz.pdp.pc_market_uz_with_security_first.entity.Characteristics;
import uz.pdp.pc_market_uz_with_security_first.projection.CustomCharacteristics;

import java.util.List;
import java.util.Optional;

@RepositoryRestResource(path = "characteristics", excerptProjection = CustomCharacteristics.class)
public interface CharacteristicsRepository extends JpaRepository<Characteristics, Integer> {

//    @PreAuthorize("hasRole('admin')")
//    @Override
//    List<Characteristics> findAll();
//
//    @PreAuthorize("hasRole('admin')")
//    @Override
//    Optional<Characteristics> findById(Integer integer);
//
//    @PreAuthorize("hasRole('admin')")
//    @Override
//    <S extends Characteristics> S save(S s);
//
//    @PreAuthorize("hasRole('admin')")
//    @Override
//    <S extends Characteristics> S saveAndFlush(S s);
//
//    @PreAuthorize("hasRole('admin')")
//    @Override
//    void deleteById(Integer integer);
}
