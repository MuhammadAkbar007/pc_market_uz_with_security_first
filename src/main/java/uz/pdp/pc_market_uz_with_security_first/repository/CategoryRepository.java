package uz.pdp.pc_market_uz_with_security_first.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.security.access.prepost.PreAuthorize;
import uz.pdp.pc_market_uz_with_security_first.entity.Category;
import uz.pdp.pc_market_uz_with_security_first.projection.CustomCategory;

import java.util.List;
import java.util.Optional;

@RepositoryRestResource(path = "category", excerptProjection = CustomCategory.class)
public interface CategoryRepository extends JpaRepository<Category, Integer> {

//    @PreAuthorize("hasRole('admin')")
//    @Override
//    List<Category> findAll();
//
//    @PreAuthorize("hasRole('admin')")
//    @Override
//    Optional<Category> findById(Integer integer);
//
//    @PreAuthorize("hasRole('admin')")
//    @Override
//    <S extends Category> S save(S s);
//
//    @PreAuthorize("hasRole('admin')")
//    @Override
//    <S extends Category> S saveAndFlush(S s);
//
//    @PreAuthorize("hasRole('admin')")
//    @Override
//    void deleteById(Integer integer);
}
