package project.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "shop_kategory")
public class Shop_Kategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "nazwa")
    private String nazwa;

    @OneToOne(mappedBy = "shopKategory",cascade = CascadeType.ALL)
    private Shop shop;

    public Shop_Kategory() {
    }

    public Shop_Kategory(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getId() {
        return id;
    }

    public String getNazwa() {
        return nazwa;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public Shop getShop() {
        return shop;
    }

    @Override
    public String toString() {
        return "Shop_Kategory{" +
                "id=" + id +
                ", nazwa='" + nazwa + '\'' +
                '}';
    }
}
