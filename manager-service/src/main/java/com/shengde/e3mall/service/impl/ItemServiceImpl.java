package com.shengde.e3mall.service.impl;

import com.shengde.e3mall.dao.TbItemDao;
import com.shengde.e3mall.entity.TbItem;
import com.shengde.e3mall.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 商品条码
 */
public class ItemServiceImpl implements ItemService {

    @Autowired
    private TbItemDao itemMapper;

    @Override
    public TbItem getItemById(Integer id) {
        TbItem item = itemMapper.queryById(id);
        return item;
    }

}
