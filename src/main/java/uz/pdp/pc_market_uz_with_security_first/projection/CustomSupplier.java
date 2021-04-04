package uz.pdp.pc_market_uz_with_security_first.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.pc_market_uz_with_security_first.entity.Supplier;

@Projection(types = Supplier.class)
public interface CustomSupplier {

    Integer getId();

    String getFullName();

    String getEmail();

    String getPhoneNumber();

    String getMessage();
}
