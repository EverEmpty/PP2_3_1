package web.dao;

import org.springframework.stereotype.Repository;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> userList() {
        return entityManager.createQuery("from User", User.class).getResultList();
    }
    @Override
    public void saveUser(User user) {
        entityManager.persist(user);
    }

    @Override
    public void updateUser(User user) {
        entityManager.merge(user);
    }

    @Override
    public void deleteUser(long ID) {
        entityManager.remove(entityManager.find(User.class, ID));
    }

    @Override
    public User getUserById(long ID) {
        return entityManager.createQuery("from User where id = :id", User.class)
                .setParameter("id", ID).getSingleResult();
    }
}
