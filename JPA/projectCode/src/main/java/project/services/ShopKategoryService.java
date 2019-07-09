package project.services;

import project.entity.Shop_Kategory;

import java.util.List;

public interface ShopKategoryService {

    List<Shop_Kategory> getShopsKategory();

    public void saveShopKategory(Shop_Kategory shopKategory);

    public Shop_Kategory getShopKategory(int shopKategoryid);

    public void deleteShopKategory(int shopKategoryid);
}
