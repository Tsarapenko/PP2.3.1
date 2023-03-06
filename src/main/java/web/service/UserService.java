package web.service;

import web.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUser();

    void add(User user);

    User getUserById(Long id);

    void deleteUserById(Long id);

    void updateUser(User user);


}
