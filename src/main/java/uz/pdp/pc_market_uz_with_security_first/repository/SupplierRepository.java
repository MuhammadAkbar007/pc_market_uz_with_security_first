package uz.pdp.pc_market_uz_with_security_first.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.security.access.prepost.PreAuthorize;
import uz.pdp.pc_market_uz_with_security_first.entity.Supplier;
import uz.pdp.pc_market_uz_with_security_first.projection.CustomSupplier;

import java.util.List;
import java.util.Optional;

@RepositoryRestResource(path = "supplier", excerptProjection = CustomSupplier.class)
public interface SupplierRepository extends JpaRepository<Supplier, Integer> {

//    @PreAuthorize("hasRole('admin')")
//    @Override
//    List<Supplier> findAll();
//
//    @PreAuthorize("hasRole('admin')")
//    @Override
//    Optional<Supplier> findById(Integer integer);
//
//    @PreAuthorize("hasRole('admin')")
//    @Override
//    <S extends Supplier> S save(S s);
//
//    @PreAuthorize("hasRole('admin')")
//    @Override
//    <S extends Supplier> S saveAndFlush(S s);
//
//    @PreAuthorize("hasRole('admin')")
//    @Override
//    void deleteById(Integer integer);
}
