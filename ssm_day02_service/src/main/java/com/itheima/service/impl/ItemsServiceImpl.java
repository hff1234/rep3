package com.itheima.service.impl;

import com.itheima.dao.ItemsDao;
import com.itheima.domain.Items;
import com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLOutput;

/**
 * ClassName:ItemsServiceImpl
 * Package:com.itheima.service.impl
 * Description:
 *
 * @Date:2021/6/12 16:39
 * Author:huangfei@java.com
 */

@Service
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private ItemsDao itemsDao;


    public Items findById(Integer id) {
        return itemsDao.findById(id);
    }
}
