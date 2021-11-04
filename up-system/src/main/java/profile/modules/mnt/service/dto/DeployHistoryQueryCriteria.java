
package profile.modules.mnt.service.dto;

import lombok.Data;
import profile.annotation.Query;
import java.sql.Timestamp;
import java.util.List;

/**
* @author wenyan
*/
@Data
public class DeployHistoryQueryCriteria{

	/**
	 * 精确
	 */
	@Query(blurry = "appName,ip,deployUser")
	private String blurry;

	@Query
	private Long deployId;

	@Query(type = Query.Type.BETWEEN)
	private List<Timestamp> deployDate;
}
