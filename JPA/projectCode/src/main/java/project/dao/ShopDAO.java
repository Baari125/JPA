package project.dao;

import project.entity.Shop;

import java.util.List;

public interface ShopDAO {

    public List<Shop> getShops();

    public void saveShop(Shop shop);

    public Shop getShop(int shopid);

    public void deleteShop(int shopid);

}
