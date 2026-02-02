package resigna2.regalos.dtos.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PersonaRequest {
    @NotBlank(message = "{persona.name.blank}")
    private String name;

    @NotBlank(message = "{persona.first.subname.blank}")
    private String firstSubname;

    private String secondSubname;
    @NotBlank(message = "{persona.relation.blank}")
    private String relacionCode;
}
