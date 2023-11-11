package boot.crud.PP_3_1_2_springboot_crud.DAO;

import boot.crud.PP_3_1_2_springboot_crud.models.User;

import java.util.List;

public interface UserDao {
    List<User> allUsers();
    User showUser(int id);
    void saveUser(User user);
    void delUser(int id);
}
