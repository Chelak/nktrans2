package com.nktrans.service;

import com.nktrans.entity.Category;

import java.util.List;

/**
 * Created by scelac on 8/5/16.
 */
public interface CategoryService {
    Category findOne(Long categoryId);
    List<Category> findAll();
    void save(Category category);
    void deleteById(Long categoryId);

}
