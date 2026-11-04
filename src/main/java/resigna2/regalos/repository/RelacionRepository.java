package resigna2.regalos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import resigna2.regalos.model.wki.Relacion;

public interface RelacionRepository extends JpaRepository<Relacion, String>, JpaSpecificationExecutor<Relacion> {
}
