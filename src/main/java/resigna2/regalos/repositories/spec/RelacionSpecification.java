package resigna2.regalos.repositories.spec;

import org.springframework.data.jpa.domain.Specification;
import resigna2.regalos.dtos.request.filters.WellKnowInstanceFilterRequest;
import resigna2.regalos.entities.wki.Relacion;

public class RelacionSpecification {
    private final static String CODE = "code";
    private final static String NAME = "name";

    public static Specification<Relacion> filter (WellKnowInstanceFilterRequest request){
        Specification<Relacion> spec ;

        spec = filterByCode(request.getCode());
        spec = filterByName(request.getName());
        return spec;
    }

    private static Specification<Relacion> filterByName(String name){
        return ((root, query, criteriaBuilder) -> {
           if(name != null ){
               return criteriaBuilder.like(criteriaBuilder.upper(root.get(NAME)), "%"+ name.toUpperCase()+"%");
           }
           return criteriaBuilder.conjunction();
        });
    }
    private static Specification<Relacion> filterByCode(String code){
        return ((root, query, criteriaBuilder) -> {
           if(code != null ){
               return criteriaBuilder.like(criteriaBuilder.upper(root.get(CODE)), "%"+ code.toUpperCase()+"%");
           }
           return criteriaBuilder.conjunction();
        });
    }
}
