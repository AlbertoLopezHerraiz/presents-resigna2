package resigna2.regalos.dtos.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PersonaResponse {
    private UUID id;
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private RelacionResponse relacion;
}
