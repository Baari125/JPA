package project.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.dao.ShopDAO;
import project.entity.Shop;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ShopServiceImpl implements ShopService{

    @Autowired
    private ShopDAO shopDAO;

    @Override
    @Transactional
    public List<Shop> getShops()
    {
        List<Shop> shops = shopDAO.getShops();
        return shops;
    }

    @Override
    @Transactional
    public void saveShop(Shop shop)
    {
        shopDAO.saveShop(shop);
    }

    @Override
    @Transactional
    public Shop getShop(int shopid)
    {
        return shopDAO.getShop(shopid);
    }

    @Override
    @Transactional
    public void deleteShop(int shopid)
    {
        shopDAO.deleteShop(shopid);
    }
}
