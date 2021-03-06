
package profile.modules.system.service.dto;

import lombok.Data;
import profile.annotation.Query;


@Data
public class DictDetailQueryCriteria {

    @Query(type = Query.Type.INNER_LIKE)
    private String label;

    @Query(propName = "name",joinName = "dict")
    private String dictName;
}