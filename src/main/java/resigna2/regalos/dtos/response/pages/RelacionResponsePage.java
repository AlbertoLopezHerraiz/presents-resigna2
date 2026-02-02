package resigna2.regalos.dtos.response.pages;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import resigna2.regalos.dtos.response.RelacionResponse;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class RelacionResponsePage {
    List<RelacionResponse> content;
    int pageNumber;
    int pageSize;
    long totalElements;
}
