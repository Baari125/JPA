package project.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "shop")
public class Shop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "nazwa")
    private String nazwa;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="kategoria_id")
    private Shop_Kategory shopKategory;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="address_id")
    private Shop_Address shopAddress;

    @ManyToMany
    @JoinTable(
            name = "shop_to_item",
            joinColumns = @JoinColumn(name = "shop_id"),
            inverseJoinColumns = @JoinColumn(name = "item_id")
    )
    private Set<Item> items;

    public void addItem(Item item)
    {
        if(items == null)
            items = new HashSet<>();

        items.add(item);
    }

    public void removeItem(Item item)
    {
        if(items == null)
            return;

        items.remove(item);
    }

    public Shop() {
    }

    public Shop(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getId() {
        return id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public Shop_Kategory getShopKategory() {
        return shopKategory;
    }

    public Shop_Address getShopAddress() {
        return shopAddress;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setShopKategory(Shop_Kategory shopKategory) {
        this.shopKategory = shopKategory;
    }

    public void setShopAddress(Shop_Address shopAddress) {
        this.shopAddress = shopAddress;
    }

    public Set<Item> getItems() {
        return items;
    }

    public void setItems(Set<Item> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "id=" + id +
                ", nazwa='" + nazwa + '\'' +
                '}';
    }
}
