package resigna2.regalos.model.wki;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(schema = "regalos", name = "component_states")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ComponentState {

    @Id
    @Column(name = "code", nullable = false, length = 4)
    private String code;

    @Column(name = "name", nullable = false, length = 20)
    private String name;
}