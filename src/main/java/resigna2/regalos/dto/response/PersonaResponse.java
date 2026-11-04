package resigna2.regalos.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class PersonaResponse {
    private UUID id;
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private RelacionResponse relacion;
}
