package resigna2.regalos.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import resigna2.regalos.dtos.response.PersonaResponse;
import resigna2.regalos.services.PersonaService;

import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/personas")
public class PersonaController {

    private final PersonaService personaService;
    @GetMapping
    private ResponseEntity<List<PersonaResponse>> obtenerPersonas(){
        List<PersonaResponse> personas = personaService.obtenerPersonas();
        return ResponseEntity.ok(personas);
    }
    @GetMapping("/{id}")
    private ResponseEntity<PersonaResponse> obtenerPersona(@PathVariable UUID id){
        PersonaResponse persona = personaService.obtenerPersona(id);
        return ResponseEntity.ok(persona);
    }
}

