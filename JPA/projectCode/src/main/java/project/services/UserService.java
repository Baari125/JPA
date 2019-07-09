package project.services;

import project.entity.User;

public interface UserService {

    void save(User user);

    User findByUsername(String username);
}
