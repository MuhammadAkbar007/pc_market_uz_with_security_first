package uz.pdp.pc_market_uz_with_security_first.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.pc_market_uz_with_security_first.entity.Article;
import uz.pdp.pc_market_uz_with_security_first.projection.CustomArticle;

@RepositoryRestResource(path = "article", excerptProjection = CustomArticle.class)
public interface ArticleRepository extends JpaRepository<Article, Integer> {
}
