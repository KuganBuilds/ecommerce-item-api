package com.kuganBuilds.item_api.service;

import com.kuganBuilds.item_api.model.Item;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;


@Service
public class ItemService {

    private final List<Item> items = new ArrayList<>();
    private final AtomicLong idGenerator = new AtomicLong(1);

    public Item addItem(Item item) {
        item.setId(idGenerator.getAndIncrement());
        items.add(item);
        return item;
    }

    public Optional<Item> getItemById(Long id) {
        return items.stream()
                .filter(item -> item.getId().equals(id))
                .findFirst();
    }

    public List<Item> getAllItems(){
        return items;
    }
}
