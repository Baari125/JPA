package project.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.dao.ItemKategoryDAO;
import project.entity.Item_Kategory;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ItemKategoryServiceImpl implements ItemKategoryService {

    @Autowired
    private ItemKategoryDAO itemKategoryDAO;

    @Override
    @Transactional
    public List<Item_Kategory> getItemsKategory()
    {
        List<Item_Kategory> itemsKategory = itemKategoryDAO.getItemsKategory();
        return itemsKategory;
    }

    @Override
    @Transactional
    public void saveItemKategory(Item_Kategory item_kategory)
    {
        itemKategoryDAO.saveItemKategory(item_kategory);
    }

    @Override
    @Transactional
    public Item_Kategory getItemKategory(int itemKategoryid)
    {
        return itemKategoryDAO.getItemKategory(itemKategoryid);
    }

    @Override
    @Transactional
    public void deleteItemKategory(int itemKategoryid)
    {
        itemKategoryDAO.deleteItemKategory(itemKategoryid);
    }
}
