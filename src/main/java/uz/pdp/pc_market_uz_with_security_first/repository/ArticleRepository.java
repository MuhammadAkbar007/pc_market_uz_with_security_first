package uz.pdp.pc_market_uz_with_security_first.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.security.access.prepost.PreAuthorize;
import uz.pdp.pc_market_uz_with_security_first.entity.Article;
import uz.pdp.pc_market_uz_with_security_first.projection.CustomArticle;

import java.util.List;
import java.util.Optional;

@RepositoryRestResource(path = "article", excerptProjection = CustomArticle.class)
public interface ArticleRepository extends JpaRepository<Article, Integer> {

//    @PreAuthorize("hasRole('admin')")
//    @Override
//    List<Article> findAll();
//
//    @PreAuthorize("hasRole('admin')")
//    @Override
//    Optional<Article> findById(Integer integer);
//
//    @PreAuthorize("hasRole('admin')")
//    @Override
//    <S extends Article> S save(S s);
//
//    @PreAuthorize("hasRole('admin')")
//    @Override
//    <S extends Article> S saveAndFlush(S s);
//
//    @PreAuthorize("hasRole('admin')")
//    @Override
//    void deleteById(Integer integer);
}
