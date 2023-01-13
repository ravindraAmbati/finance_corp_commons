package corp.finance.commons.collateral.model;

import corp.finance.commons.Audit;
import lombok.*;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@ToString
public class Valuation extends Audit {

    private String valuationId;
    private String valuationName;
    private String valuationType;
    private LocalDateTime valuatedOn;
    private LocalDateTime nextValuationDate;
    private LocalDateTime expireDate;
}
