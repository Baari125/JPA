package project.services;

import project.entity.Item;

import java.util.List;

public interface ItemService {

    List<Item> getItems();

    public void saveItem(Item item);

    public Item getItem(int itemid);

    public void deleteItem(int itemid);
}
