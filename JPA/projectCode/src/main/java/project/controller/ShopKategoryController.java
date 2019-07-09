package project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import project.entity.Shop_Kategory;
import project.services.ShopKategoryService;

import java.util.List;

@Controller
@RequestMapping("/shopsKategory")
public class ShopKategoryController {

    @Autowired
    private ShopKategoryService shopKategoryService;

    @GetMapping("/list")
    public String listShopKategory(Model model)
    {
        List<Shop_Kategory> shopsKategory = shopKategoryService.getShopsKategory();
        model.addAttribute("shopsKategory", shopsKategory);
        return "shopskategorylist";
    }

    @GetMapping("/shopkategoryadd")
    public String addShopKategory(Model model)
    {
        Shop_Kategory shop_kategory = new Shop_Kategory();
        model.addAttribute("shopKategory", shop_kategory);
        return "addshopkategoryform";
    }

    @PostMapping("/saveShopKategory")
    public String saveShopKategory(@ModelAttribute("shopKategory") Shop_Kategory shop_kategory)
    {
        shopKategoryService.saveShopKategory(shop_kategory);
        return "redirect:/shopsKategory/list";
    }

    @GetMapping("updateShopKategoryForm")
    public String updateShopKategoryForm(@RequestParam("shopKategoryId")int shopKategoryid, Model model)
    {
        Shop_Kategory shop_kategory = shopKategoryService.getShopKategory(shopKategoryid);
        model.addAttribute("shopKategory", shop_kategory);
        return "addshopkategoryform";
    }

    @GetMapping("deleteShopKategoryForm")
    public String deleteShopKategoryForm(@RequestParam("shopKategoryId")int shopKategoryid, Model model){
        shopKategoryService.deleteShopKategory(shopKategoryid);
        return "redirect:/shopsKategory/list";
    }
}
