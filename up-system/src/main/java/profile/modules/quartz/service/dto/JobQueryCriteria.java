
package profile.modules.quartz.service.dto;

import lombok.Data;
import profile.annotation.Query;
import java.sql.Timestamp;
import java.util.List;

/**
 * @author wenyan
 */
@Data
public class JobQueryCriteria {

    @Query(type = Query.Type.INNER_LIKE)
    private String jobName;

    @Query
    private Boolean isSuccess;

    @Query(type = Query.Type.BETWEEN)
    private List<Timestamp> createTime;
}
