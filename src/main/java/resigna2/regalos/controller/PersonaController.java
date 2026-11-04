package resigna2.regalos.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import resigna2.regalos.dto.request.PersonaRequest;
import resigna2.regalos.dto.response.PersonaResponse;
import resigna2.regalos.service.PersonaService;

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

    @PostMapping()
    private ResponseEntity<String> crearPersona(@RequestBody PersonaRequest request){

        return ResponseEntity.ok(personaService.createPersona(request));
    }
}

