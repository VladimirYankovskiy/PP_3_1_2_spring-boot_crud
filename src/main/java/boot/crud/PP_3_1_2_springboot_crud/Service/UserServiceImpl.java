package boot.crud.PP_3_1_2_springboot_crud.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import boot.crud.PP_3_1_2_springboot_crud.DAO.UserDao;
import boot.crud.PP_3_1_2_springboot_crud.models.User;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {
    private UserDao userDao;
    @Autowired
    public UserServiceImpl(UserDao carDao) {
        this.userDao = carDao;
    }
    @Override
    public List<User> allUsers() {
        return userDao.allUsers();
    }
    @Override
    public User showUser(int id) {
        return userDao.showUser(id);
    }
    @Override
    @Transactional
    public void saveUser(User user) {
        userDao.saveUser(user);
    }
    @Override
    @Transactional
    public void delUser(int id) {
        userDao.delUser(id);
    }
}
