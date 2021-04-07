package uz.pdp.pc_market_uz_with_security_first.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.security.access.prepost.PreAuthorize;
import uz.pdp.pc_market_uz_with_security_first.entity.Comment;
import uz.pdp.pc_market_uz_with_security_first.projection.CustomComment;

import java.util.List;
import java.util.Optional;

@RepositoryRestResource(path = "comment", excerptProjection = CustomComment.class)
public interface CommentRepository extends JpaRepository<Comment, Integer> {

//    @PreAuthorize("hasRole('admin')")
//    @Override
//    List<Comment> findAll();
//
//    @PreAuthorize("hasRole('admin')")
//    @Override
//    Optional<Comment> findById(Integer integer);
//
//    @PreAuthorize("hasRole('admin')")
//    @Override
//    <S extends Comment> S save(S s);
//
//    @PreAuthorize("hasRole('admin')")
//    @Override
//    <S extends Comment> S saveAndFlush(S s);
//
//    @PreAuthorize("hasRole('admin')")
//    @Override
//    void deleteById(Integer integer);
}
