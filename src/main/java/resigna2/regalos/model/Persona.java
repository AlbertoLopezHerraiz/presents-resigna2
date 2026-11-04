package resigna2.regalos.model;

import jakarta.persistence.*;
import lombok.*;
import resigna2.regalos.model.wki.Relacion;

import java.util.UUID;

@Entity
@Table(schema = "regalos", name = "people")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private UUID idPersona;

    @Column(name = "name")
    private String nombre;

    @Column(name = "first_subname")
    private String primerApellido;

    @Column(name = "second_subname")
    private String segundoApellido;

    @ManyToOne
    @JoinColumn(name = "relation", referencedColumnName = "code")
    private Relacion relacion;
}
