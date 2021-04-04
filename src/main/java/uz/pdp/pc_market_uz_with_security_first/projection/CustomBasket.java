package uz.pdp.pc_market_uz_with_security_first.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.pc_market_uz_with_security_first.entity.Basket;
import uz.pdp.pc_market_uz_with_security_first.entity.OutputProduct;
import uz.pdp.pc_market_uz_with_security_first.entity.User;

import java.util.List;

@Projection(types = Basket.class)
public interface CustomBasket {

    Integer getId();

    Double getSum();

    User getUser();

    List<OutputProduct> getOutputProductList();
}
