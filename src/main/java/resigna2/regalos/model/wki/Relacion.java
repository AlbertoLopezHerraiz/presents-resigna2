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
@Table(schema = "regalos", name = "relations")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Relacion {
    @Id
    @Column(name = "code", nullable = false, length = 10)
    private String code;

    private String name;
}
