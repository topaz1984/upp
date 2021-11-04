
package profile.modules.system.service.dto;

import lombok.Getter;
import lombok.Setter;
import profile.base.BaseDTO;
import java.io.Serializable;


@Getter
@Setter
public class DictDetailDto extends BaseDTO implements Serializable {

    private Long id;

    private DictSmallDto dict;

    private String label;

    private String value;

    private Integer dictSort;
}