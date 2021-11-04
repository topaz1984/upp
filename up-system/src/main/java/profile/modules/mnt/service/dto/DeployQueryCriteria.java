
package profile.modules.mnt.service.dto;

import lombok.Data;
import profile.annotation.Query;
import java.sql.Timestamp;
import java.util.List;

/**
* @author wenyan
*/
@Data
public class DeployQueryCriteria{

	/**
	 * 模糊
	 */
    @Query(type = Query.Type.INNER_LIKE, propName = "name", joinName = "app")
    private String appName;

	@Query(type = Query.Type.BETWEEN)
	private List<Timestamp> createTime;

}
