package uz.pdp.pc_market_uz_with_security_first.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.security.access.prepost.PreAuthorize;
import uz.pdp.pc_market_uz_with_security_first.entity.Address;
import uz.pdp.pc_market_uz_with_security_first.projection.CustomAddress;

import java.util.List;
import java.util.Optional;

@RepositoryRestResource(path = "address", excerptProjection = CustomAddress.class)
public interface AddressRepository extends JpaRepository<Address, Integer> {

//    @PreAuthorize("hasRole('admin')")
//    @Override
//    List<Address> findAll();
//
//    @PreAuthorize("hasRole('admin')")
//    @Override
//    Optional<Address> findById(Integer integer);
//
//    @PreAuthorize("hasRole('admin')")
//    @Override
//    <S extends Address> S save(S s);
//
//    @PreAuthorize("hasRole('admin')")
//    @Override
//    <S extends Address> S saveAndFlush(S s);
//
//    @PreAuthorize("hasRole('admin')")
//    @Override
//    void deleteById(Integer integer);
}
