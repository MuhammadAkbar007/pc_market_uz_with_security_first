package uz.pdp.pc_market_uz_with_security_first.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.pc_market_uz_with_security_first.entity.Region;

@Projection(types = Region.class)
public interface CustomRegion {

    Integer getId();

    String getName();
}
