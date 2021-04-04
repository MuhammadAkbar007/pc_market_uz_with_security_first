package uz.pdp.pc_market_uz_with_security_first.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.pc_market_uz_with_security_first.entity.Category;

@Projection(types = Category.class)
public interface CustomCategory {

    Integer getId();

    String getNameUz();

    String getNameEng();

    String getNameRu();

    Category getParentCategory();
}
