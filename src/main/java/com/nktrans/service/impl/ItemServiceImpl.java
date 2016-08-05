package com.nktrans.service.impl;

import com.nktrans.entity.Item;
import com.nktrans.repository.ItemRepository;
import com.nktrans.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by scelac on 8/5/16.
 */
public class ItemServiceImpl implements ItemService {

    @Autowired
    ItemRepository itemRepository;
    @Override
    public Item findOne(Long itemId) {
        return null;
    }

    @Override
    public List<Item> findAll() {
        return null;
    }

    @Override
    public List<Item> findByCategoryId(Long categoryId) {
        return null;
    }

    @Override
    public void save(Item item) {

    }

    @Override
    public void deleteById(Long itemId) {

    }
}
