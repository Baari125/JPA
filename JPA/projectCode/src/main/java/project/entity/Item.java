package project.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "item")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "nazwa")
    private String nazwa;

    @Column(name = "cena")
    private float cena;

    @Column(name = "liczba")
    private int liczba;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="kategoria_id")
    private Item_Kategory itemKategory;

    @ManyToMany
    @JoinTable(
            name = "shop_to_item",
            joinColumns = @JoinColumn(name = "item_id"),
            inverseJoinColumns = @JoinColumn(name = "shop_id")
    )
    private Set<Shop> shops;

    public void addItem(Shop shop)
    {
        if(shops == null)
            shops = new HashSet<>();

        shops.add(shop);
    }

    public void removeItem(Shop shop)
    {
        if(shops == null)
            return;

        shops.remove(shop);
    }

    public Item() {
    }

    public Item(String nazwa, float cena, int liczba) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.liczba = liczba;
    }

    public int getId() {
        return id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public float getCena() {
        return cena;
    }

    public int getLiczba() {
        return liczba;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setCena(float cena) {
        this.cena = cena;
    }

    public void setLiczba(int liczba) {
        this.liczba = liczba;
    }

    public Item_Kategory getItemKategory() {
        return itemKategory;
    }

    public Set<Shop> getShops() {
        return shops;
    }

    public void setItemKategory(Item_Kategory itemKategory) {
        this.itemKategory = itemKategory;
    }

    public void setShops(Set<Shop> shops) {
        this.shops = shops;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", nazwa='" + nazwa + '\'' +
                ", cena=" + cena +
                ", liczba=" + liczba +
                '}';
    }
}
