package uz.pdp.pc_market_uz_with_security_first.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.pc_market_uz_with_security_first.entity.Basket;
import uz.pdp.pc_market_uz_with_security_first.entity.Order;

import java.util.Date;

@Projection(types = Order.class)
public interface CustomOrder {

    Integer getId();

    Date getDate();

    String getDetails();

    Basket getBasket();
}
