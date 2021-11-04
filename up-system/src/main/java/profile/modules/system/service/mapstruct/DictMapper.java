
package profile.modules.system.service.mapstruct;

import profile.base.BaseMapper;
import profile.modules.system.domain.Dict;
import profile.modules.system.service.dto.DictDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;


@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface DictMapper extends BaseMapper<DictDto, Dict> {

}