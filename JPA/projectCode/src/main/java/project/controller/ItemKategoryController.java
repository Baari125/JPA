package project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import project.entity.Item_Kategory;
import project.services.ItemKategoryService;

import java.util.List;

@Controller
@RequestMapping("/itemsKategory")
public class ItemKategoryController {

    @Autowired
    private ItemKategoryService itemKategoryService;

    @GetMapping("/list")
    public String listItemKategory(Model model)
    {
        List<Item_Kategory> itemsKategory = itemKategoryService.getItemsKategory();
        model.addAttribute("itemsKategory", itemsKategory);
        return "itemskategorylist";
    }

    @GetMapping("/itemkategoryadd")
    public String addItemKategory(Model model)
    {
        Item_Kategory item_kategory = new Item_Kategory();
        model.addAttribute("itemKategory", item_kategory);
        return "additemkategoryform";
    }

    @PostMapping("/saveItemKategory")
    public String saveItemKategory(@ModelAttribute("itemKategory") Item_Kategory item_kategory)
    {
        itemKategoryService.saveItemKategory(item_kategory);
        return "redirect:/itemsKategory/list";
    }

    @GetMapping("updateItemKategoryForm")
    public String updateItemKategoryForm(@RequestParam("itemKategoryId")int itemKategoryid, Model model)
    {
        Item_Kategory item_kategory = itemKategoryService.getItemKategory(itemKategoryid);
        model.addAttribute("itemKategory", item_kategory);
        return "additemkategoryform";
    }

    @GetMapping("deleteItemKategoryForm")
    public String deleteItemKategoryForm(@RequestParam("itemKategoryId")int itemKategoryid, Model model){
        itemKategoryService.deleteItemKategory(itemKategoryid);
        return "redirect:/itemsKategory/list";
    }
}
