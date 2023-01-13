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
public class User extends Audit {

    private String userId;
    private String userName;
    private String userType;
    private Contact contact;
}
