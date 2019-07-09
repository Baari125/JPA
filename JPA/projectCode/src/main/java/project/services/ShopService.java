package project.services;

import project.entity.Shop;

import java.util.List;

public interface ShopService {

    List<Shop> getShops();

    public void saveShop(Shop shop);

    public Shop getShop(int shopid);

    public void deleteShop(int shopid);
}
