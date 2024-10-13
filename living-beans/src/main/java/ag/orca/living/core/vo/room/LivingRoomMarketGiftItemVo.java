package ag.orca.living.core.vo.room;

import ag.orca.living.core.BaseBean;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@SuperBuilder
@Data
@NoArgsConstructor
public class LivingRoomMarketGiftItemVo extends BaseBean {

    @Schema(name = "id", description = "id")
    private Long id;
    /**
     * 机构ID
     */
    @Schema(name = "orgId", description = "机构ID")
    private Long orgId;
    /**
     * 房间ID
     */
    @Schema(name = "roomId", description = "房间ID")
    private Long roomId;

    /**
     * 礼品库ID
     */
    @Schema(name = "giftLibId", description = "礼品库ID")
    private Long giftLibId;

    /**
     * 礼物名称
     */
    @Schema(name = "name", description = "礼物名称")
    private String name;

    /**
     * 礼物图片
     */
    @Schema(name = "img", description = "礼物图片")
    private String img;

    /**
     * 礼物价格,分
     */
    @Schema(name = "price", description = "礼物价格,分")
    private Long price;


    /**
     * 礼物类型 1 静态礼物 2 动态礼物
     */
    @Schema(name = "giftType", description = "礼物类型 1 静态礼物 2 动态礼物")
    private Integer giftType;

    /**
     * 状态 1 上架 2 下架
     */
    @Schema(name = "status", description = "状态 1 上架 2 下架")
    private Integer status;

    @Schema(name = "priority", description = "优先级")
    private Integer priority;
}