package uz.pdp.pc_market_uz_with_security_first.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.pc_market_uz_with_security_first.entity.Address;
import uz.pdp.pc_market_uz_with_security_first.entity.User;

@Projection(types = User.class)
public interface CustomUser {

    Integer getId();

    String getFullName();

    String getEmail();

    String getPassword();

    Address getAddress();
}
