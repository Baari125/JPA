package project.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.dao.ItemDAO;
import project.entity.Item;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ItemServiceImpl implements ItemService{

    @Autowired
    private ItemDAO itemDAO;

    @Override
    @Transactional
    public List<Item> getItems()
    {
        List<Item> items = itemDAO.getItems();
        return items;
    }

    @Override
    @Transactional
    public void saveItem(Item item)
    {
        itemDAO.saveItem(item);
    }

    @Override
    @Transactional
    public Item getItem(int itemid)
    {
        return itemDAO.getItem(itemid);
    }

    @Override
    @Transactional
    public void deleteItem(int itemid)
    {
        itemDAO.deleteItem(itemid);
    }
}
