package ag.orca.living.core.ro.query;

import ag.orca.living.core.ro.PageRo;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Data
@SuperBuilder
@Schema(name = "QueryChannelLivingDimensionRo", description = "直播维度查询vo")
public class QueryChannelLivingDimensionRo extends PageRo {

    /**
     * 直播间id
     */

    private Long roomId;

    /**
     * 渠道id
     */

    private Long channelId;

}
