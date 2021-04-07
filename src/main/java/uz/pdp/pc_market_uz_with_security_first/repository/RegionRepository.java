package uz.pdp.pc_market_uz_with_security_first.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.security.access.prepost.PreAuthorize;
import uz.pdp.pc_market_uz_with_security_first.entity.Region;
import uz.pdp.pc_market_uz_with_security_first.projection.CustomRegion;

import java.util.List;
import java.util.Optional;

@RepositoryRestResource(path = "region", excerptProjection = CustomRegion.class)
public interface RegionRepository extends JpaRepository<Region, Integer> {

//    @PreAuthorize("hasRole('admin')")
//    @Override
//    List<Region> findAll();
//
//    @PreAuthorize("hasRole('admin')")
//    @Override
//    Optional<Region> findById(Integer integer);
//
//    @PreAuthorize("hasRole('admin')")
//    @Override
//    <S extends Region> S save(S s);
//
//    @PreAuthorize("hasRole('admin')")
//    @Override
//    <S extends Region> S saveAndFlush(S s);
//
//    @PreAuthorize("hasRole('admin')")
//    @Override
//    void deleteById(Integer integer);
}
