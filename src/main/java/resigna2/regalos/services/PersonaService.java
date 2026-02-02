package resigna2.regalos.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import resigna2.regalos.dtos.response.PersonaResponse;
import resigna2.regalos.dtos.response.RelacionResponse;
import resigna2.regalos.entities.Persona;
import resigna2.regalos.mappers.PersonaMapper;
import resigna2.regalos.mappers.RelacionMapper;
import resigna2.regalos.repositories.PersonaRepository;

import java.util.List;
import java.util.UUID;

@Slf4j
@RequiredArgsConstructor
@Service
public class PersonaService {

    private final PersonaRepository personaRepository;
    private final PersonaMapper personaMapper;

    public List<PersonaResponse> obtenerPersonas() {

        List<Persona> personas =  personaRepository.findAll();
        return personas.stream().map(personaMapper::toDTO).toList();
    }

    public PersonaResponse obtenerPersona(UUID id) {

        Persona persona =personaRepository.findById(id).orElse(null);
        if(persona == null){
            return null;
        }
        return personaMapper.toDTO(persona);
    }
}
