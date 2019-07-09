package project.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import project.entity.User;

@Repository
public class UserDAOImpl implements UserDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public User getUserByUsername(String username)
    {
        Session currentSesion = sessionFactory.getCurrentSession();
        Query<User> query = currentSesion.createQuery(" from Users where username = " + username);
        User user = query.getSingleResult();

        return user;
    }

    @Override
    public void saveUser(User user)
    {
        Session session = sessionFactory.getCurrentSession();

        session.save(user);
    }
}
