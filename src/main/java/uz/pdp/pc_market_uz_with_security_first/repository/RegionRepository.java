package uz.pdp.pc_market_uz_with_security_first.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.pc_market_uz_with_security_first.entity.Region;
import uz.pdp.pc_market_uz_with_security_first.projection.CustomRegion;

@RepositoryRestResource(path = "region", excerptProjection = CustomRegion.class)
public interface RegionRepository extends JpaRepository<Region, Integer> {
}
