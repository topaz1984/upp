package profile.repository;

import profile.domain.AlipayConfig;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author wyan
 */
public interface AliPayRepository extends JpaRepository<AlipayConfig,Long> {
}
