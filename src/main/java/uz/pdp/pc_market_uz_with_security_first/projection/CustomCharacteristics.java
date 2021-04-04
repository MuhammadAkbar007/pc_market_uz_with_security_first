package uz.pdp.pc_market_uz_with_security_first.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.pc_market_uz_with_security_first.entity.Characteristics;

@Projection(types = Characteristics.class)
public interface CustomCharacteristics {

    Integer getId();

    String getName();

    String getType();
}
