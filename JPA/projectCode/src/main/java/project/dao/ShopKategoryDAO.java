package project.dao;

import project.entity.Shop_Kategory;

import java.util.List;

public interface ShopKategoryDAO {

    public List<Shop_Kategory> getShopsKategory();

    public void saveShopKategory(Shop_Kategory shopKategory);

    public Shop_Kategory getShopKategory(int shopKategoryid);

    public void deleteShopKategory(int shopKategoryid);
}
