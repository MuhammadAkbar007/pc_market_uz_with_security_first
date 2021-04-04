package uz.pdp.pc_market_uz_with_security_first.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.pc_market_uz_with_security_first.entity.District;
import uz.pdp.pc_market_uz_with_security_first.projection.CustomDistrict;

@RepositoryRestResource(path = "district", excerptProjection = CustomDistrict.class)
public interface DistrictRepository extends JpaRepository<District, Integer> {
}
