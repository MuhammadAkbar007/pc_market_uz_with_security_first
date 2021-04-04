package uz.pdp.pc_market_uz_with_security_first.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.pc_market_uz_with_security_first.entity.Article;
import uz.pdp.pc_market_uz_with_security_first.entity.Attachment;

@Projection(types = Article.class)
public interface CustomArticle {

    Integer getId();

    String getTitle();

    String getDescription();

    String getLink();

    Attachment getAttachment();
}
