package project.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import project.entity.Shop;

import java.util.List;

@Repository
public class ShopDAOImpl implements ShopDAO{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Shop> getShops()
    {
        Session currentSesion = sessionFactory.getCurrentSession();
        Query<Shop> query = currentSesion.createQuery(" from Shop", Shop.class);
        List<Shop> shops = query.getResultList();

        return shops;
    }

    @Override
    public void saveShop(Shop shop)
    {
        Session session = sessionFactory.getCurrentSession();

        session.save(shop);
    }

    @Override
    public Shop getShop(int shopid)
    {
        Session currentSesion = sessionFactory.getCurrentSession();
        Query<Shop> query = currentSesion.createQuery(" from Shop where id = " + shopid);
        Shop shop = query.getSingleResult();

        return shop;
    }

    @Override
    public void deleteShop(int shopid)
    {
        Session currentSesion = sessionFactory.getCurrentSession();
        Shop shop = currentSesion.find(Shop.class, shopid);
        currentSesion.delete(shop);
    }
}
