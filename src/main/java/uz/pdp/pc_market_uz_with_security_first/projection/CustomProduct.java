package uz.pdp.pc_market_uz_with_security_first.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.pc_market_uz_with_security_first.entity.Attachment;
import uz.pdp.pc_market_uz_with_security_first.entity.Category;
import uz.pdp.pc_market_uz_with_security_first.entity.Product;

@Projection(types = Product.class)
public interface CustomProduct {

    Integer getId();

    String getName();

    String getModel();

    String getDescription();

    Double getPrice();

    Boolean getActive();

    Attachment getAttachment();

    Category getCategory();
}
