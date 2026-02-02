package resigna2.regalos.mappers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import resigna2.regalos.configuration.i18n.MessageUtil;
import resigna2.regalos.dtos.response.RelacionResponse;
import resigna2.regalos.entities.wki.Relacion;

@Component
@RequiredArgsConstructor
public class RelacionMapper {

    private final MessageUtil messageUtil;

    public RelacionResponse toResponse (Relacion entity){
        if(entity== null) return null;
        String name = messageUtil.getMessageOrDefault("relations."+ entity.getCode(), entity.getName());
        return RelacionResponse.builder()
                .code(entity.getCode())
                .name(entity.getName())
                .build();
    }
}
