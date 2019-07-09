package project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import project.entity.Shop;
import project.services.ShopKategoryService;
import project.services.ShopService;

import java.util.List;

@Controller
@RequestMapping("/shops")
public class ShopController {

    @Autowired
    private ShopService shopService;

    @Autowired
    private ShopKategoryService shopKategoryService;

    @GetMapping("/list")
    public String listShop(Model model)
    {
        List<Shop> shops = shopService.getShops();
        model.addAttribute("shops", shops);
        return "shopslist";
    }

    @GetMapping("/shopadd")
    public String addShop(Model model)
    {
        Shop shop = new Shop();
        model.addAttribute("shop", shop);
        return "addshopform";
    }

    @PostMapping("/saveShop")
    public String saveShop(@ModelAttribute("shop") Shop shop)
    {
        shopService.saveShop(shop);
        return "redirect:/shops/list";
    }

    @GetMapping("/updateShopForm")
    public String updateShopForm(@RequestParam("shopId")int shopid, Model model)
    {
        Shop shop = shopService.getShop(shopid);
        model.addAttribute("shop", shop);
        return "addshopform";
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @GetMapping("deleteShopForm")
    public String deleteShopForm(@RequestParam("shopId")int shopid, Model model){
        shopService.deleteShop(shopid);
        return "redirect:/shops/list";
    }

    @GetMapping("/selectShopForm")
    public String selectShopForm(@RequestParam("shopId")int shopid, Model model)
    {
        Shop shop = shopService.getShop(shopid);

        return "selectshopform";
    }

}
