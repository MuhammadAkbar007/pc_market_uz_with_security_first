package uz.pdp.pc_market_uz_with_security_first.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.pc_market_uz_with_security_first.entity.OutputProduct;
import uz.pdp.pc_market_uz_with_security_first.entity.Product;

@Projection(types = OutputProduct.class)
public interface CustomOutputProduct {

    Integer getId();

    Double getAmount();

    Product getProduct();
}
