
package profile.service.dto;

import lombok.Data;
import java.sql.Timestamp;
import java.util.List;

import profile.annotation.Query;


@Data
public class LocalStorageQueryCriteria{

    @Query(blurry = "name,suffix,type,createBy,size")
    private String blurry;

    @Query(type = Query.Type.BETWEEN)
    private List<Timestamp> createTime;
}