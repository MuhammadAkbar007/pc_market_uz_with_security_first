package uz.pdp.pc_market_uz_with_security_first.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.security.access.prepost.PreAuthorize;
import uz.pdp.pc_market_uz_with_security_first.entity.OutputProduct;
import uz.pdp.pc_market_uz_with_security_first.projection.CustomOutputProduct;

import java.util.List;
import java.util.Optional;

@RepositoryRestResource(path = "outputProduct", excerptProjection = CustomOutputProduct.class)
public interface OutputProductRepository extends JpaRepository<OutputProduct, Integer> {

//    @PreAuthorize("hasRole('admin')")
//    @Override
//    List<OutputProduct> findAll();
//
//    @PreAuthorize("hasRole('admin')")
//    @Override
//    Optional<OutputProduct> findById(Integer integer);
//
//    @PreAuthorize("hasRole('admin')")
//    @Override
//    <S extends OutputProduct> S save(S s);
//
//    @PreAuthorize("hasRole('admin')")
//    @Override
//    <S extends OutputProduct> S saveAndFlush(S s);
//
//    @PreAuthorize("hasRole('admin')")
//    @Override
//    void deleteById(Integer integer);
}
