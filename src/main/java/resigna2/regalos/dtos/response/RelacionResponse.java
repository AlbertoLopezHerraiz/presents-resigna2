package resigna2.regalos.dtos.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RelacionResponse {
    private String code;
    private String name;
}
