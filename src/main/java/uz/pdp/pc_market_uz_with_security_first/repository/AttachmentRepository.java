package uz.pdp.pc_market_uz_with_security_first.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.access.prepost.PreAuthorize;
import uz.pdp.pc_market_uz_with_security_first.entity.Attachment;

public interface AttachmentRepository extends JpaRepository<Attachment, Integer> {
}
