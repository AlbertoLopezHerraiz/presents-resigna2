package resigna2.regalos.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import resigna2.regalos.config.i18n.MessageUtil;
import resigna2.regalos.dto.request.PersonaRequest;
import resigna2.regalos.dto.response.PersonaResponse;
import resigna2.regalos.model.Persona;
import resigna2.regalos.model.wki.Relacion;
import resigna2.regalos.mapper.PersonaMapper;
import resigna2.regalos.repository.PersonaRepository;

import java.util.List;
import java.util.UUID;

@Slf4j
@RequiredArgsConstructor
@Service
public class PersonaService {

    private final PersonaRepository personaRepository;
    private final PersonaMapper personaMapper;

    private final MessageUtil messageUtil;
    private final RelacionService relationService;

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

    @Transactional
    public String createPersona(PersonaRequest request){

        Relacion relacion = relationService.getRelacion(request.getRelacionCode());

        Persona toCreate = Persona.builder()
                .nombre(request.getName())
                .primerApellido(request.getFirstSubname())
                .segundoApellido(request.getSecondSubname())
                .relacion(relacion)
                .build();
        if(!comprobarPersonaUnica(toCreate))return messageUtil.getMessage("persona.not-unique");
        personaRepository.save(toCreate);
        return messageUtil.getMessage("persona.saved");
    }

    private boolean comprobarPersonaUnica(Persona persona){
        List<Persona> findDuplicated =
                personaRepository.findByNombreAndPrimerApellidoAndSegundoApellido(persona.getNombre(),
                        persona.getPrimerApellido(), persona.getSegundoApellido());
        return findDuplicated.isEmpty();
    }
}
