package boot.crud.PP_3_1_2_springboot_crud.DAO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import boot.crud.PP_3_1_2_springboot_crud.models.User;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> allUsers() {
        return entityManager.createQuery("from User", User.class).getResultList();
    }
    @Override
    public User showUser(int id) {
        return entityManager.find(User.class,id);
    }
    @Override
    public void saveUser(User user) {
        if(user.getId() != 0) {
            entityManager.merge(user);
        } else {
            entityManager.persist(user);
        }
        entityManager.flush();
    }
    @Override
    public void delUser(int id) {
        entityManager.remove(showUser(id));
        entityManager.flush();
    }

}
