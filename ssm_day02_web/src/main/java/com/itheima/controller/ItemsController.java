package com.itheima.controller;

import com.itheima.domain.Items;
import com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ClassName:ItemsController
 * Package:com.itheima.controller
 * Description:
 *
 * @Date:2021/6/12 17:07
 * Author:huangfei@java.com
 */

@Controller
@RequestMapping("/items")
public class ItemsController {
    @Autowired
    private ItemsService itemsService;

    @RequestMapping("/findDetail")
    public String findDetail(Model model){

       Items items =itemsService.findById(1);
       model.addAttribute("item",items);
        System.out.println("=========================================");
       return "itemsDetail.jsp";

    }

}
