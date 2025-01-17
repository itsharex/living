package ag.orca.living.core.entity.sys;

import ag.orca.living.core.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@SuperBuilder
@Data
@NoArgsConstructor
public class SysRobot extends BaseEntity {

    private Long id;

    private String nickname;

    private String headIco;

}
