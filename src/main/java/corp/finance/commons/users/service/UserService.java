package corp.finance.commons.users.service;


import corp.finance.commons.users.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    List<User> getUsers(List<String> userIds);

    User getUser(String userId);
}
