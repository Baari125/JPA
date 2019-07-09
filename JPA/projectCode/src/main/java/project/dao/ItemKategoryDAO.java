package project.dao;

import project.entity.Item_Kategory;

import java.util.List;

public interface ItemKategoryDAO {


    public List<Item_Kategory> getItemsKategory();

    public void saveItemKategory(Item_Kategory item_kategory);

    public Item_Kategory getItemKategory(int itemKategoryid);

    public void deleteItemKategory(int itemKategoryid);
}
