package uz.pdp.pc_market_uz_with_security_first.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.security.access.prepost.PreAuthorize;
import uz.pdp.pc_market_uz_with_security_first.entity.District;
import uz.pdp.pc_market_uz_with_security_first.projection.CustomDistrict;

import java.util.List;
import java.util.Optional;

@RepositoryRestResource(path = "district", excerptProjection = CustomDistrict.class)
public interface DistrictRepository extends JpaRepository<District, Integer> {

//    @PreAuthorize("hasRole('admin')")
//    @Override
//    List<District> findAll();
//
//    @PreAuthorize("hasRole('admin')")
//    @Override
//    Optional<District> findById(Integer integer);
//
//    @PreAuthorize("hasRole('admin')")
//    @Override
//    <S extends District> S save(S s);
//
//    @PreAuthorize("hasRole('admin')")
//    @Override
//    <S extends District> S saveAndFlush(S s);
//
//    @PreAuthorize("hasRole('admin')")
//    @Override
//    void deleteById(Integer integer);
}
