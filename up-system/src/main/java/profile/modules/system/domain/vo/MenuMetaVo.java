package profile.modules.system.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.io.Serializable;

/**
 * @author wenyan
 */
@Data
@AllArgsConstructor
public class MenuMetaVo implements Serializable {

    private String title;

    private String icon;

    private Boolean noCache;
}
