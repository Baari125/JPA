package project.dao;

import project.entity.User;

public interface UserDAO {

    public User getUserByUsername(String username);

    public void saveUser(User user);
}
