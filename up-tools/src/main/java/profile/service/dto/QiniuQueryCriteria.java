
package profile.service.dto;

import lombok.Data;
import profile.annotation.Query;

import java.sql.Timestamp;
import java.util.List;


@Data
public class QiniuQueryCriteria{

    @Query(type = Query.Type.INNER_LIKE)
    private String key;

    @Query(type = Query.Type.BETWEEN)
    private List<Timestamp> createTime;
}
