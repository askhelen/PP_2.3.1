package web.service;

import web.entity.User;

import java.util.List;

public interface UserService {
    List<User> getUsers();

    void save(User user);

    User findUser(int id);

    void update(User user);

    void delete(int id);

}
