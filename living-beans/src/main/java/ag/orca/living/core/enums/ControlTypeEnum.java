package ag.orca.living.core.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 场控类别枚举, 1: 氛围场控
 *
 * @author gechenpeng
 * @date 2024-05-03
 */
@Getter
@AllArgsConstructor
public enum ControlTypeEnum {

    /**
     * 氛围场控
     */
    ATMOSPHERE_FIELD_CONTROL(1);

    private final Integer code;
}
