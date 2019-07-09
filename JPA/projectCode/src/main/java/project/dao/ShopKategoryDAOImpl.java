package project.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import project.entity.Shop_Kategory;

import java.util.List;

@Repository
public class ShopKategoryDAOImpl implements ShopKategoryDAO{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Shop_Kategory> getShopsKategory()
    {
        Session currentSesion = sessionFactory.getCurrentSession();
        Query<Shop_Kategory> query = currentSesion.createQuery(" from Shop_Kategory", Shop_Kategory.class);
        List<Shop_Kategory> shopsKategory = query.getResultList();

        return shopsKategory;
    }

    @Override
    public void saveShopKategory(Shop_Kategory shopKategory)
    {
        Session session = sessionFactory.getCurrentSession();

        session.saveOrUpdate(shopKategory);
    }

    @Override
    public Shop_Kategory getShopKategory(int shopKategoryid)
    {
        Session currentSesion = sessionFactory.getCurrentSession();
        Query<Shop_Kategory> query = currentSesion.createQuery(" from Shop_Kategory where id = " + shopKategoryid);
        Shop_Kategory shop_kategory = query.getSingleResult();

        return shop_kategory;
    }

    @Override
    public void deleteShopKategory(int shopKategoryid)
    {
        Session currentSesion = sessionFactory.getCurrentSession();
        Shop_Kategory shop_kategory = currentSesion.find(Shop_Kategory.class, shopKategoryid);
        currentSesion.delete(shop_kategory);
    }
}
