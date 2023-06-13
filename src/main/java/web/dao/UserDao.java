package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {

    List<User> userList();

    void saveUser(User user);

    void updateUser(User user);

    void deleteUser(long ID);

    User getUserById(long ID);
}
