package resigna2.regalos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import resigna2.regalos.model.Persona;

import java.util.List;
import java.util.UUID;

public interface PersonaRepository extends JpaRepository<Persona, UUID> {
    List<Persona> findByNombreAndPrimerApellidoAndSegundoApellido(String nombre, String primerApellido, String segundoApellido);
}
