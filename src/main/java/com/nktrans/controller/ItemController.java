package com.nktrans.controller;

import com.nktrans.entity.Item;
import com.nktrans.service.CategoryService;
import com.nktrans.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by user on 8/13/16.
 */
@Controller
@RequestMapping("/item")
public class ItemController {

    @Autowired
    CategoryService categoryService;
    @Autowired
    ItemService itemService;


    @RequestMapping(method = RequestMethod.GET)
    String getAll(ModelMap modelMap){
        List<Item> itemList = itemService.findAll();
        modelMap.addAttribute("itemList", itemList);

        return "item";
    }

    @RequestMapping(value = "/category/{categoryId}", method = RequestMethod.GET)
    String getByCategoryId(@PathVariable("categoryId") Long categoryId, ModelMap modelMap){

        List<Item> itemList = itemService.findByCategoryId(categoryId);
        modelMap.addAttribute("itemList", itemList);
        return "item";
    }


}
