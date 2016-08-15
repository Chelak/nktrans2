package com.nktrans.controller;

import com.nktrans.entity.Category;
import com.nktrans.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by user on 8/13/16.
 */
@Controller
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @RequestMapping(method = RequestMethod.GET)
    public String getAllCategories(ModelMap modelMap)
    {
        List<Category> categories = categoryService.findAll();

        modelMap.addAttribute("categories", categories);
        modelMap.addAttribute("pageContent", "content/category-list");
        return "category";
    }

    @RequestMapping(value = "/new", method = RequestMethod.GET)
    public String getAddForm(ModelMap modelMap)
    {
        Category category = new Category();

        modelMap.addAttribute("category", category);
        modelMap.addAttribute("pageContent", "content/category-add");
        return "category";
    }

    @RequestMapping(value = "/add-category", method = RequestMethod.POST)
    public String addCategory(@Valid @ModelAttribute("category") Category category,
                              BindingResult result, ModelMap modelMap){
        if (result.hasErrors()) {
            return "error";
        }

        categoryService.save(category);

        return "redirect:/category";
    }
}
