package corp.finance.commons.customer.model;

import corp.finance.commons.Audit;
import corp.finance.commons.collateral.model.Collateral;
import corp.finance.commons.products.model.Product;
import corp.finance.commons.users.model.User;
import lombok.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@ToString
@Component
public class Customer {

    private User user;
    private List<Product> products;
    private List<Collateral> collaterals;
    private Audit audit;
}
