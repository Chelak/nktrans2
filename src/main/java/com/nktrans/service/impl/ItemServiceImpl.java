package com.nktrans.service.impl;

import com.nktrans.entity.Item;
import com.nktrans.repository.ItemRepository;
import com.nktrans.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by scelac on 8/5/16.
 */
@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    ItemRepository itemRepository;

    @Override
    @Transactional
    public Item findOne(Long itemId) {
        return null;
    }

    @Override
    @Transactional
    public List<Item> findAll() {
        return null;
    }

    @Override
    @Transactional
    public List<Item> findByCategoryId(Long categoryId) {
        return null;
    }

    @Override
    @Transactional
    public void save(Item item) {

    }

    @Override
    @Transactional
    public void deleteById(Long itemId) {

    }
}
