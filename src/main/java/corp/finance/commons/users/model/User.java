package corp.finance.commons.users.model;


import corp.finance.commons.Audit;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@ToString
public class User extends Audit {

    private String userId;
    private String userName;
    private String userType;
    private Contact contact;
}
