package resigna2.regalos.mapper;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import resigna2.regalos.dto.response.PersonaResponse;
import resigna2.regalos.model.Persona;

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
