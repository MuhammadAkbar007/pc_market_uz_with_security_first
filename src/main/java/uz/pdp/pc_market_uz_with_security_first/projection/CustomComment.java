package uz.pdp.pc_market_uz_with_security_first.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.pc_market_uz_with_security_first.entity.Comment;
import uz.pdp.pc_market_uz_with_security_first.entity.Product;
import uz.pdp.pc_market_uz_with_security_first.entity.User;

@Projection(types = Comment.class)
public interface CustomComment {

    Integer getId();

    String getBody();

    Integer getNumberOfStars();

    User getUser();

    Product getProduct();
}
