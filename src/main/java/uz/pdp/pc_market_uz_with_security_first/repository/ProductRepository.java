package uz.pdp.pc_market_uz_with_security_first.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.security.access.prepost.PreAuthorize;
import uz.pdp.pc_market_uz_with_security_first.entity.Product;
import uz.pdp.pc_market_uz_with_security_first.projection.CustomProduct;

import java.util.List;
import java.util.Optional;

@RepositoryRestResource(path = "product", excerptProjection = CustomProduct.class)
public interface ProductRepository extends JpaRepository<Product, Integer> {

//    @PreAuthorize("hasAnyRole('admin', 'moderator', 'operator')")
//    @Override
//    List<Product> findAll();
//
//    @PreAuthorize("hasAnyRole('admin', 'moderator', 'operator')")
//    @Override
//    Optional<Product> findById(Integer integer);
//
//    @PreAuthorize("hasAnyRole('admin', 'moderator', 'operator')")
//    @Override
//    <S extends Product> S save(S s);
//
//    @PreAuthorize("hasAnyRole('admin', 'moderator')")
//    @Override
//    <S extends Product> S saveAndFlush(S s);
//
//    @PreAuthorize("hasRole('admin')")
//    @Override
//    void deleteById(Integer integer);
}
