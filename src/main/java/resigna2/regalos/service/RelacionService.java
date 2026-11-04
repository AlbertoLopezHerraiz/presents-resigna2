package resigna2.regalos.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import resigna2.regalos.dto.request.filters.WellKnowInstanceFilterRequest;
import resigna2.regalos.dto.response.pages.RelacionResponsePage;
import resigna2.regalos.model.wki.Relacion;
import resigna2.regalos.mapper.RelacionMapper;
import resigna2.regalos.repository.RelacionRepository;
import resigna2.regalos.repository.spec.RelacionSpecification;

import java.util.stream.Collectors;

@Slf4j
@RequiredArgsConstructor
@Service
public class RelacionService {

    private final RelacionRepository relacionRepository;
    private final RelacionMapper relacionMapper;

    @Transactional
    public RelacionResponsePage findAllRelations(WellKnowInstanceFilterRequest request){
        Sort.Direction direction = Sort.Direction.fromString(request.getSort());
        Sort sort = (request.getFields() == null || request.getFields().length == 0)
                ? Sort.unsorted()
                : Sort.by(direction, request.getFields());
        Pageable pageable = PageRequest.of(request.getPage()-1, request.getSize(), sort);
        Page<Relacion> relationsPage = relacionRepository.findAll(RelacionSpecification.filter(request), pageable);
        return RelacionResponsePage.builder()
                .content(relationsPage.getContent().stream().map(r->relacionMapper.toResponse(r)).collect(Collectors.toList()))
                .pageNumber(relationsPage.getNumber())
                .pageSize(relationsPage.getSize())
                .totalElements(relationsPage.getTotalElements())
                .build();
    }

    public Relacion getRelacion(String code){
        return relacionRepository.findById(code).orElse(null);
    }
}
