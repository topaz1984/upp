package profile.repository;

import profile.domain.EmailConfig;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author wyan
 */
public interface EmailRepository extends JpaRepository<EmailConfig,Long> {
}
