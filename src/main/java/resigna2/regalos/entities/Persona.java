package resigna2.regalos.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Cleanup;
import lombok.Data;
import resigna2.regalos.entities.wki.Relacion;

import java.util.UUID;

@Entity
@Table(schema = "regalos", name = "people")
@Data
@Builder
@AllArgsConstructor
public class Persona {
    @Id
    @Column(name = "id")
    private UUID idPersona;

    @Column(name = "name")
    private String nombre;

    @Column(name = "first_subname")
    private String primerApellido;

    @Column(name = "second_subname")
    private String segundoApellido;

    @ManyToOne
    @JoinColumn(name = "relation_code", referencedColumnName = "code")
    private Relacion relacion;
}
