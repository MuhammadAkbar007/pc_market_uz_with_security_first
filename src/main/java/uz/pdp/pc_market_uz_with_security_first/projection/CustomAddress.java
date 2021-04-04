package uz.pdp.pc_market_uz_with_security_first.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.pc_market_uz_with_security_first.entity.Address;
import uz.pdp.pc_market_uz_with_security_first.entity.District;

@Projection(types = Address.class)
public interface CustomAddress {

    Integer getId();

    String getStreet();

    Integer getHomeNumber();

    District getDistrict();
}
