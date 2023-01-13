package corp.finance.commons.users.model;

import corp.finance.commons.Audit;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@ToString
public class Contact extends Audit {

    private String phoneNumber;
    private String emailAddress;
    private String address;
}
