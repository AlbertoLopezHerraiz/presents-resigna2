package resigna2.regalos.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import resigna2.regalos.model.wki.ComponentState;

import java.util.UUID;

@Entity
@Table(schema = "regalos", name = "measurament_units")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Component {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "state_code", referencedColumnName = "code")
    private ComponentState state;

    private int quantity;
}
