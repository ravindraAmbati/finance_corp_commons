package corp.finance.commons.users.model;

import corp.finance.commons.Audit;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@Builder
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@ToString
public class Contact extends Audit {

    private String phoneNumber;
    private String emailAddress;
    private String address;
}
