package web.service;

import org.springframework.stereotype.Component;
import web.dao.UserDao;
import web.model.User;

import java.util.List;

@Component
public class UserServiceImpl implements UserService{

    private UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> userList(){
        return userDao.userList();
    }

    @Override
    public void saveUser(User user){
        userDao.saveUser(user);
    }

    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    @Override
    public void deleteUser(long ID) {
        userDao.deleteUser(ID);
    }

    @Override
    public User getUserById(long ID) {
        return userDao.getUserById(ID);
    }
}
