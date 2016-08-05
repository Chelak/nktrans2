package com.nktrans.service;

import com.nktrans.entity.Category;
import com.nktrans.entity.Item;

import java.util.List;

/**
 * Created by scelac on 8/5/16.
 */
public interface ItemService {

    Item findOne(Long itemId);
    List<Item> findAll();
    List<Item> findByCategoryId(Long categoryId);
    void save(Item item);
    void deleteById(Long itemId);
}
