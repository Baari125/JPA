package project.dao;

import project.entity.Item;

import java.util.List;

public interface ItemDAO {

    public List<Item> getItems();

    public void saveItem(Item item);

    public Item getItem(int itemid);

    public void deleteItem(int itemid);
}
