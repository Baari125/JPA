package project.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import project.entity.Item_Kategory;

import java.util.List;

@Repository
public class ItemKategoryDAOImpl implements ItemKategoryDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Item_Kategory> getItemsKategory()
    {
        Session currentSesion = sessionFactory.getCurrentSession();
        Query<Item_Kategory> query = currentSesion.createQuery(" from Item_Kategory", Item_Kategory.class);
        List<Item_Kategory> shopsKategory = query.getResultList();

        return shopsKategory;
    }

    @Override
    public void saveItemKategory(Item_Kategory item_kategory)
    {
        Session session = sessionFactory.getCurrentSession();

        session.saveOrUpdate(item_kategory);
    }

    @Override
    public Item_Kategory getItemKategory(int itemKategoryid)
    {
        Session currentSesion = sessionFactory.getCurrentSession();
        Query<Item_Kategory> query = currentSesion.createQuery(" from Item_Kategory where id = " + itemKategoryid);
        Item_Kategory item_kategory = query.getSingleResult();

        return item_kategory;
    }

    @Override
    public void deleteItemKategory(int itemKategoryid)
    {
        Session currentSesion = sessionFactory.getCurrentSession();
        Item_Kategory item_kategory = currentSesion.find(Item_Kategory.class, itemKategoryid);
        currentSesion.delete(item_kategory);
    }
}
