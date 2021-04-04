package uz.pdp.pc_market_uz_with_security_first.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.pc_market_uz_with_security_first.entity.Characteristics;
import uz.pdp.pc_market_uz_with_security_first.projection.CustomCharacteristics;

@RepositoryRestResource(path = "characteristics", excerptProjection = CustomCharacteristics.class)
public interface CharacteristicsRepository extends JpaRepository<Characteristics, Integer> {
}
