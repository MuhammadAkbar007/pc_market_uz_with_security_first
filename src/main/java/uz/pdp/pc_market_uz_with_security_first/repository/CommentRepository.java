package uz.pdp.pc_market_uz_with_security_first.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.pc_market_uz_with_security_first.entity.Comment;
import uz.pdp.pc_market_uz_with_security_first.projection.CustomComment;

@RepositoryRestResource(path = "comment", excerptProjection = CustomComment.class)
public interface CommentRepository extends JpaRepository<Comment, Integer> {
}
