package resigna2.regalos.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import resigna2.regalos.dto.request.filters.WellKnowInstanceFilterRequest;
import resigna2.regalos.dto.response.pages.RelacionResponsePage;
import resigna2.regalos.service.RelacionService;

@RestController
@RequestMapping("/api/v1/resigna2/regalos/relations")
@RequiredArgsConstructor
public class RelacionController {

    private final RelacionService relacionService;

    @GetMapping()
    public ResponseEntity<RelacionResponsePage> getAllRelaciones(WellKnowInstanceFilterRequest request){
        return ResponseEntity.ok(relacionService.findAllRelations(request));
    }
}
