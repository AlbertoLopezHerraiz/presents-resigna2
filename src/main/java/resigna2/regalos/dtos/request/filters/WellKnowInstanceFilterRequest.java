package resigna2.regalos.dtos.request.filters;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class WellKnowInstanceFilterRequest {

    @Positive(message = "{validation.page.positive}")
    private Integer page = 1;

    @Positive(message = "{validation.size.positive}")
    private Integer size = 10;

    private String[] fields;

    @Pattern(regexp = "asc|desc", message = "{validation.sort.values}")
    private String sort = "desc";

    @Valid
    private String code;

    @Valid
    private String name;
}
