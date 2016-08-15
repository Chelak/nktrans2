package com.nktrans.service.impl;

import com.nktrans.entity.Category;
import com.nktrans.repository.CategoryRepository;
import com.nktrans.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by scelac on 8/5/16.
 */
@Service
@Transactional
public class CategoryServiceImpl implements CategoryService {
   @Autowired
   CategoryRepository categoryRepository;

    @Override
     public Category findOne(Long categoryId) {
        return categoryRepository.findOne(categoryId);
    }

    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public void save(Category category) {
        categoryRepository.saveAndFlush(category);
    }

    @Override
    public void deleteById(Long categoryId) {
            categoryRepository.delete(categoryId);
    }
}
