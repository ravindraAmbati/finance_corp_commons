package corp.finance.commons.products.model;

import corp.finance.commons.Audit;
import lombok.*;

import java.time.LocalDateTime;
import java.time.Period;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@ToString
public class Tenure extends Audit {

    private String tenureId;
    private String tenureName;
    private Period tenurePeriod;
    private LocalDateTime tenureStartDate;
    private LocalDateTime tenureEndDate;
    private Period tenureInterval;

}
