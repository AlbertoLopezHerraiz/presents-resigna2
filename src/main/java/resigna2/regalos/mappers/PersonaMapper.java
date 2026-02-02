package resigna2.regalos.mappers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import resigna2.regalos.dtos.response.PersonaResponse;
import resigna2.regalos.entities.Persona;

@Component
@RequiredArgsConstructor
public class PersonaMapper {

    private final RelacionMapper relacionMapper;

    public PersonaResponse toDTO(Persona entity){
        return PersonaResponse.builder()
                .nombre(entity.getNombre())
                .primerApellido(entity.getPrimerApellido())
                .segundoApellido(entity.getSegundoApellido())
                .relacion(relacionMapper.toResponse(entity.getRelacion()))
                .build();
    }
}
