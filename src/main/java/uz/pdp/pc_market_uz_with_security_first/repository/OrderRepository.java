package uz.pdp.pc_market_uz_with_security_first.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.security.access.prepost.PreAuthorize;
import uz.pdp.pc_market_uz_with_security_first.entity.Order;
import uz.pdp.pc_market_uz_with_security_first.projection.CustomOrder;

import java.util.List;
import java.util.Optional;

@RepositoryRestResource(path = "order", excerptProjection = CustomOrder.class)
public interface OrderRepository extends JpaRepository<Order, Integer> {

//    @PreAuthorize("hasAnyRole('admin', 'operator')")
//    @Override
//    List<Order> findAll();
//
//    @PreAuthorize("hasAnyRole('admin', 'operator')")
//    @Override
//    Optional<Order> findById(Integer integer);
//
//    @PreAuthorize("hasAnyRole('admin', 'operator')")
//    @Override
//    <S extends Order> S save(S s);
//
//    @PreAuthorize("hasAnyRole('admin', 'operator')")
//    @Override
//    <S extends Order> S saveAndFlush(S s);
//
//    @PreAuthorize("hasAnyRole('admin', 'operator')")
//    @Override
//    void deleteById(Integer integer);
}
