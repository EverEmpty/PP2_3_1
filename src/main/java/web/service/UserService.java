package web.service;

import web.model.User;

import java.util.List;

public interface UserService {

    List<User> userList();

    void saveUser(User user);

    void updateUser(User user);

    void deleteUser(long ID);

    User getUserById(long ID);
}
