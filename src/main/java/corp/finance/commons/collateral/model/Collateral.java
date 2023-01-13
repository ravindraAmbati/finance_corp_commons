package corp.finance.commons.collateral.model;

import corp.finance.commons.Audit;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@ToString
public class Collateral extends Audit {

    private String collateralId;
    private String collateralName;
    private String collateralType;
    private Valuation valuation;
}
