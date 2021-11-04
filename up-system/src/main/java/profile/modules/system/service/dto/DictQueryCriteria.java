
package profile.modules.system.service.dto;

import lombok.Data;
import profile.annotation.Query;

/**
 * 公共查询类
 */
@Data
public class DictQueryCriteria {

    @Query(blurry = "name,description")
    private String blurry;
}
