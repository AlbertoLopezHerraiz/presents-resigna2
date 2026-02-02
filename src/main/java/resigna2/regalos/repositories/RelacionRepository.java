package resigna2.regalos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import resigna2.regalos.entities.wki.Relacion;

public interface RelacionRepository extends JpaRepository<Relacion, String>, JpaSpecificationExecutor<Relacion> {
}
