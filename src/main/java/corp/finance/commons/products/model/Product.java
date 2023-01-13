package corp.finance.commons.products.model;

import corp.finance.commons.Audit;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@ToString
public class Product extends Audit {

    private String productId;
    private String productName;
    private String productType;
    private Tenure tenure;
}
