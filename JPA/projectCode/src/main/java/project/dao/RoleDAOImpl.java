package project.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import project.entity.Role;

import java.util.List;

@Repository
public class RoleDAOImpl implements RoleDAO{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Role> getRoles()
    {
        Session currentSesion = sessionFactory.getCurrentSession();
        Query<Role> query = currentSesion.createQuery(" from Roles", Role.class);
        List<Role> roles = query.getResultList();

        return roles;
    }

}
