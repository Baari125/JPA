package project.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import project.entity.Item;

import java.util.List;

@Repository
public class ItemDAOImpl implements ItemDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Item> getItems()
    {
        Session currentSesion = sessionFactory.getCurrentSession();
        Query<Item> query = currentSesion.createQuery(" from Item", Item.class);
        List<Item> items = query.getResultList();

        return items;
    }

    @Override
    public void saveItem(Item item)
    {
        Session session = sessionFactory.getCurrentSession();

        session.saveOrUpdate(item);
    }

    @Override
    public Item getItem(int itemid)
    {
        Session currentSesion = sessionFactory.getCurrentSession();
        Query<Item> query = currentSesion.createQuery(" from Item where id = " + itemid);
        Item item = query.getSingleResult();

        return item;
    }

    @Override
    public void deleteItem(int itemid)
    {
        Session currentSesion = sessionFactory.getCurrentSession();
        Item item = currentSesion.find(Item.class, itemid);
        currentSesion.delete(item);
    }
}
