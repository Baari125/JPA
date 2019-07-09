package project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import project.entity.Item;
import project.services.ItemService;

import java.util.List;

@Controller
@RequestMapping("/items")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @GetMapping("/list")
    public String listItem(Model model)
    {
        List<Item> items= itemService.getItems();
        model.addAttribute("items", items);
        return "itemslist";
    }

    @GetMapping("/itemadd")
    public String addItem(Model model)
    {
        Item item = new Item();
        model.addAttribute("item", item);
        return "additemform";
    }

    @PostMapping("/saveItem")
    public String saveItem(@ModelAttribute("item") Item item)
    {
        itemService.saveItem(item);
        return "redirect:/items/list";
    }

    @GetMapping("updateItemForm")
    public String updateItemForm(@RequestParam("itemId")int itemid, Model model)
    {
        Item item = itemService.getItem(itemid);
        model.addAttribute("item", item);
        return "additemform";
    }

    @GetMapping("deleteItemForm")
    public String deleteItemForm(@RequestParam("itemId")int itemid, Model model){
        itemService.deleteItem(itemid);
        return "redirect:/items/list";
    }
}
