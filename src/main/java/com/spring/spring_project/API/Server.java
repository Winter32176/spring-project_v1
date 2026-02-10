package com.spring.spring_project.API;

import com.spring.spring_project.Model.Dto.Item;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Server {
    private List<Item> items = new ArrayList<>();

    public Server() {

        this.items.add(new Item("Apple", "red", 10.5, "Fruit"));
        this.items.add(new Item("Banana", "yellow", 9.5, "Fruit"));
        this.items.add(new Item("Orange", "orange", 8.5, "Fruit"));
        this.items.add(new Item("Apple", "red", 10.5, "Fruit"));
        this.items.add(new Item("Banana", "yellow", 9.5, "Fruit"));
        this.items.add(new Item("Orange", "orange", 8.5, "Fruit"));

    }

    public Server setItems(List<Item> items) {
        this.items = items;
        return this;
    }

    public List<Item> getItems() {
        return items;
    }

    public boolean addItem(Item item) {
        if (items.contains(item) || item.getCategory() == null) {
            return false;
        }
        items.add(item);
        return true;
    }

    public boolean editItem(long id, Item newItem) {
        var s = items.stream().filter(i -> i.getId() == id).findFirst().orElse(null);
        if (s == null)
            return false;
        else
            items.remove(s);

        return addItem(newItem);
    }

    public Item getItemById(long id) {
        return items.stream().filter(i -> i.getId() == id).findFirst().orElse(null);
    }

}
