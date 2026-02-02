package resigna2.regalos.dtos.response.pages;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import resigna2.regalos.dtos.response.PersonaResponse;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class PersonaResponsePage {
    List<PersonaResponse> content;
    int pageNumber;
    int pageSize;
    long totalElements;
}
