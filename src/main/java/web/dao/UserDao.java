package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUser();

    void add(User user);

    User getUserById(Long id);

    void deleteUserById(Long id);

    void updateUser(User user);


}
