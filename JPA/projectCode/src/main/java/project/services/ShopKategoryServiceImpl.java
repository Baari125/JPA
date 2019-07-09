package project.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.dao.ShopKategoryDAO;
import project.entity.Shop_Kategory;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ShopKategoryServiceImpl implements ShopKategoryService{

    @Autowired
    private ShopKategoryDAO shopKategoryDAO;

    @Override
    @Transactional
    public List<Shop_Kategory> getShopsKategory()
    {
        List<Shop_Kategory> shopsKategory = shopKategoryDAO.getShopsKategory();
        return shopsKategory;
    }

    @Override
    @Transactional
    public void saveShopKategory(Shop_Kategory shopKategory)
    {
        shopKategoryDAO.saveShopKategory(shopKategory);
    }

    @Override
    @Transactional
    public Shop_Kategory getShopKategory(int shopKategoryid)
    {
        return shopKategoryDAO.getShopKategory(shopKategoryid);
    }

    @Override
    @Transactional
    public void deleteShopKategory(int shopKategoryid)
    {
        shopKategoryDAO.deleteShopKategory(shopKategoryid);
    }
}
