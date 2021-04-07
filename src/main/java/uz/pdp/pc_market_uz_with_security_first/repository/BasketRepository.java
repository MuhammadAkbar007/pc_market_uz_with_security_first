package uz.pdp.pc_market_uz_with_security_first.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.security.access.prepost.PreAuthorize;
import uz.pdp.pc_market_uz_with_security_first.entity.Basket;
import uz.pdp.pc_market_uz_with_security_first.projection.CustomBasket;

import java.util.List;
import java.util.Optional;

@RepositoryRestResource(path = "basket", excerptProjection = CustomBasket.class)
public interface BasketRepository extends JpaRepository<Basket, Integer> {

//    @PreAuthorize("hasRole('admin')")
//    @Override
//    List<Basket> findAll();
//
//    @PreAuthorize("hasRole('admin')")
//    @Override
//    Optional<Basket> findById(Integer integer);
//
//    @PreAuthorize("hasRole('admin')")
//    @Override
//    <S extends Basket> S save(S s);
//
//    @PreAuthorize("hasRole('admin')")
//    @Override
//    <S extends Basket> S saveAndFlush(S s);
//
//    @PreAuthorize("hasRole('admin')")
//    @Override
//    void deleteById(Integer integer);
}
