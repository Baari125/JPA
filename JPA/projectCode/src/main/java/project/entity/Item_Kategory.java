package project.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "item_kategory")
public class Item_Kategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "nazwa")
    private String nazwa;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "itemKategory",cascade = CascadeType.ALL)
    List<Item> items;

    public void addItem(Item item)
    {
        if(items == null)
            items = new ArrayList<>();
        items.add(item);
        item.setItemKategory(this);
    }

    public Item_Kategory() {
    }

    public Item_Kategory(String nazwa) {
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

    @Override
    public String toString() {
        return "Item_Kategory{" +
                "id=" + id +
                ", nazwa='" + nazwa + '\'' +
                '}';
    }
}
